import datastruct.Cons
import datastruct.List
import datastruct.Nil

val ex1: List[Double] = datastruct.Nil
Cons(1, Nil)
Cons("a", Cons("b", Nil))
List(1, 2, 3) match {
  case _ => 42
}
//List(1, 2, 3) match {
//  case Cons(h, _) => h
//}
//List(1, 2, 3) match {
//  case Cons(_, t) => t
//}
//List(1, 2, 3) match {
//  case Nil => 42
//}
datastruct.List.sum(List(1, 2, 3))

datastruct.List.product(List(1, 2, 3))

datastruct.List.tail(List(1, 2, 3))
//datastructures.List.tail(Nil

datastruct.List.setHead(List(1, 2, 3), 4)

datastruct.List.dropWhile(List(1, 2, 3, 4, 5), (x: Int) => x <= 2)

datastruct.List.append(List(1, 2, 3), List(4, 5))

datastruct.List.init(List(1, 2, 3))

datastruct.List.dropWhile2(List(1, 2, 3, 4, 5))(_ <= 2)

datastruct.List.sum2(List(1, 2, 3))

datastruct.List.product2(List(1, 2, 3))

datastruct.List.length(List(1, 2, 3))

datastruct.List.sum3(List(1, 2, 3))
datastruct.List.product3(List(1, 2, 3))
datastruct.List.length3(List(1, 2, 3))

datastruct.List.reverse(List(1, 2, 3))

datastruct.List.appendViaRightFold(List(1, 2, 3), List(4, 5))

datastruct.List.concat(List(List(1, 2, 3), List(4, 5), List(6, 7, 8)))
datastruct.List.concat2(List(List(1, 2, 3), List(4, 5), List(6, 7, 8)))


datastruct.List.addOne(List(1, 2, 3))
datastruct.List.toString(List(1, 2, 3))

datastruct.List.map(List(1, 2, 3))(_ + 2)
datastruct.List.map2(List(1, 2, 3))(_ + 2)

datastruct.List.filter(List(1, 2, 3, 4, 5, 6))(_ % 2 != 0)

datastruct.List.flatMap(List(1, 2, 3))(i => List(i, i))
datastruct.List.flatMap2(List(1, 2, 3))(i => List(i, i))

datastruct.List.filterViaFlatMap(List(1, 2, 3))(_ % 2 != 0)

datastruct.List.addPairwise(List(1, 2, 3), List(1, 2, 3))

datastruct.List.zipWith(List(1, 2, 3), List(1, 2, 3))(_ + _)

datastruct.List.hasSubsequence(List(1, 2, 3), List(1))
datastruct.List.hasSubsequence(List(1, 2, 3), List(1, 2))
datastruct.List.hasSubsequence(List(1, 2, 3), List(1, 2, 3))
datastruct.List.hasSubsequence(List(1, 2, 3), List(2, 3))
datastruct.List.hasSubsequence(List(1, 2, 3), List(3))
datastruct.List.hasSubsequence(List(1, 2, 3), List(4))