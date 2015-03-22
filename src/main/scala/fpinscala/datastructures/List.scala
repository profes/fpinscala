package fpinscala.datastructures

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  def tail[A](ds: List[A]): List[A] = {
    ds match {
      case Nil => sys.error("list is nil")
      case Cons(_, tail) => tail
    }
  }

  def setHead[A](ds: List[A], head: A): List[A] = {
    ds match {
      case Nil => sys.error("list is nil")
      case Cons(_, tail) => Cons(head, tail)
    }
  }

  def drop[A](l: List[A], n: Int): List[A] = {
    if (n > 0)
      l match {
        case Nil => sys.error("list is nil")
        case Cons(_, tail) => drop(tail, n - 1)
      }
    else l

  }

  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      case Cons(head, tail) if f(head) => dropWhile(tail, f)
      case _ => l
    }
  }

  def init[A](l: List[A]): List[A] = {
    l match {
      case Nil => l
      case Cons(h, Nil) => Nil
      case Cons(h, t) => Cons(h, init(t))
    }
  }

  def dropWhile2[A](l: List[A])(f: A => Boolean): List[A] = {
    l match {
      case Cons(head, tail) if f(head) => dropWhile2(tail)(f)
      case _ => l
    }
  }

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
    as match {
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }
  }

  def sum2(ns: List[Int]) = foldRight(ns, 0)((x, y) => x + y)

  def product2(ds: List[Double]) = foldRight(ds, 1.0)(_ * _)
}