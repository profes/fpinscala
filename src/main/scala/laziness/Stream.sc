import laziness._

val stream: Stream[Int] = Stream.apply(1, 2, 3)

stream.toList
stream.toListRecursive

stream.take(0).toList
stream.take(1).toList
stream.take(2).toList

stream.drop(0).toList
stream.drop(1).toList
stream.drop(2).toList

stream.takeWhile(_ < 2).toList

stream.exists(_ == 2)

stream.forAll(_ < 20)

stream.takeWhile2(_ < 2).toList
stream.map(_.toString).toList

stream.filter(_ % 2 == 1).toList

stream.append(Stream.apply(1, 2, 3)).toList

stream.flatMap(_ => Stream.apply(1, 2, 3)).toList

val ones: Stream[Int] = Stream.cons(1, ones)

ones.take(5).toList

ones.exists(_ % 2 != 0)

Stream.constant(5).take(5).toList
Stream.from(5).take(5).toList
Stream.fibs.take(5).toList

Stream.fibs2.take(5).toList
Stream.from2(5).take(5).toList
Stream.constant2(5).take(5).toList

Stream.ones.take(5).toList

stream.mapViaUnfold(_.toString).toList
stream.takeViaUnfold(2).toList
stream.takeWhileViaUnfold(_ <= 2).toList

stream.zipWith(stream)((a, b) => a + b).toList
stream.zipWithAll(Stream.apply(1, 2, 3, 4, 5))((a, b) => (a, b) match {
  case (Some(a), Some(b)) => Some(s"$a + $b")
  case (Some(a), None) => Some(s"$a")
  case (None, Some(b)) => Some(s"$b")
  case (_) => None
}).toList

stream.startsWith(Stream.apply(1, 2))
stream.startsWith(Stream.apply(2))

stream.tails.toList

stream.hasSubsequence(Stream.apply(2, 3))
stream.hasSubsequence(Stream.apply(3, 4))

stream.scanRight(0)(_ + _).toList