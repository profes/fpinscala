import error._

Option.mean(List())
Option.mean(List(1, 2))

Some(1).map(_ + 1)
None.map((a: Int) => a + 1)

Some(1).getOrElse(2)
None.getOrElse(2)

Some(1).flatMap(a => Some(a + 1))
None.flatMap((a: Int) => Some(a + 1))

Some(1).orElse(None)
Some(1).orElse(Some(2))
None.orElse(Some(2))


Some(1).filter(_ > 0)
Some(1).filter(_ < 0)
None.filter((a: Int) => a > 0)

Option.variance(List(1, 2, 3, 4, 5, 6))

Option.map2(Some(1), Some(2))(_ + _)
Option.map2(Some(1), None)((a: Int, b: Int) => a + b)

Option.sequence(List(Some(1), Some(2)))
Option.sequence(List(Some(1), None))

Option.sequence2(List(Some(1), Some(2)))
Option.sequence2(List(Some(1), None))

Option.traverse(List(1, 2, 3))((a: Int) => None)
Option.traverse2(List(1, 2, 3))((a: Int) => Some(a + 1))
