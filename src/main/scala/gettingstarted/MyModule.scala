package gettingstarted

import scala.annotation.tailrec

object MyModule {
  def abs(n: Int) =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def foo() = {
    val i = 1
    i.toString
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of &d is %d"
    msg.format(n, factorial(n))
  }

  private def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-7))
    println(formatFactorial(4))
    println(formatResult("abs", -7, abs))
    println(formatResult("factorial", 10, factorial))
    println(formatResult("fib", 6, fib))
    println(findFirst(Array("a", "b", "c"), "c"))
    println(findFirst(Array("a", "b", "c"), (x: String) => x.equals("c")))
    println(isSorted(Array(1, 2, 3, 4, 5), (x: Int, y: Int) => {
      println(s"$x = $y")
      x <= y
    }))
    println(isSorted(Array(1, 4, 3, 4, 5), (x: Int, y: Int) => x <= y))
  }

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = b => f(a, b)

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = a => b => f(a, b)

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a, b) => f(a)(b)

  def compose[A, B, C](f: B => C, g: A => B): A => C = a => f(g(a))

  def findFirst(ss: Array[String], key: String): Int = {
    @tailrec
    def loop(n: Int): Int =
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)

    loop(0)
  }

  def findFirst[A](ss: Array[A], p: A => Boolean): Int = {
    @tailrec
    def loop(n: Int): Int =
      if (n >= ss.length) -1
      else if (p(ss(n))) n
      else loop(n + 1)

    loop(0)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def loop(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n + 1))) loop(n + 1)
      else false

    loop(0)
  }


  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  def fib(n: Int): Int = {
    @tailrec
    def loop(a: Int, prev: Int, cur: Int): Int =
      if (a == 0) prev
      else loop(a - 1, cur, prev + cur)

    loop(n, 0, 1)
  }
}
