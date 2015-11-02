import fpinscala.datastructures._

val l = Cons(1, Nil)

Cons("a", Cons("b", Nil))

List(1, 2, 3) match {
  case _ => 42
}
List(1, 2, 3) match {
  case Cons(h, _) => h
  case Cons(h, Nil) => h
  case Nil => -1
}

List(1, 2, 3, 4, 5) match {
  case Cons(x, Cons(2, Cons(4, _))) => x
  case Nil => 42
  case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
  case _ => 101
}

List.tail(List(1, 2, 3))
List.setHead(List(1, 2, 3), 3)
List.drop(List(1, 2, 3, 4, 5), 2)
List.dropWhile(List(1, 2, 3, 4, 5), (x: Int) => x > 2)
List.init(List(1, 2, 3, 4, 5))

List.dropWhile2(List(1, 2, 3, 4, 5))(_ > 2)

List.sum2(List(1, 2, 3))
List.product2(List(1, 2, 3, 4))

List.foldRight(List(1,2,3), Nil:List[Int])(Cons(_,_))
List.length(List(1, 2, 3))
List.foldLeft(List(1, 2, 3), 0)(_ + _)

List.sum3(List(1, 2, 3))
List.product3(List(1, 2, 3, 4))
List.length3(List(1, 2, 3))
List.reverse(List(1, 2, 3))
