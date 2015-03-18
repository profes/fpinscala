import fpinscala.datastructures._

val l = Cons(1, Nil)
Cons("a", Cons("b", Nil))

List(1, 2, 3) match {
  case _ => 42
}
List(1, 2, 3) match {
  case Cons(h, _) => h
}

