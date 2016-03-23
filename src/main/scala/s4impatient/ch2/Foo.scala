package s4impatient.ch2

import scala.annotation.tailrec

object Foo {

  def signum(n: Int): Int =
    if (n > 0) 1
    else if (n == 0) 0
    else -1

  def countdown(n: Int): Unit =
    for (i <- 0 to n) println(n - i)

  def prod(s: String): Long =
    s.foldLeft(1L)((acc, c) => acc * c.toLong)

  def prodRecursive(s: String): Long = {
    def go(i: Int, acc: Long): Long = {
      if (i < s.length)
        go(i + 1, acc * s(i))
      else
        acc
    }
    go(0, 1)
  }

  def pow(x: Double, n: Int): Double = {
    if (n == 0) {
      1
    } else if (n > 0) {
      if (n > 2 && n % 2 == 0) {
        pow(pow(x, n / 2), 2)
      } else {
        x * pow(x, n - 1)
      }
    } else {
      1 / pow(x, -n)
    }
  }
}
