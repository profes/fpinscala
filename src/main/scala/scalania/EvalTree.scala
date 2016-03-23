package scalania

sealed trait Expr[+A]
case class Value[A](b: Boolean) extends Expr[A]
case class And[A](e: Expr[A]) extends Expr[A]
case class O[A](e: Expr[A]) extends Expr[A]
case class Xor[A](e: Expr[A]) extends Expr[A]


class EvalTree {

}
