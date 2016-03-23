import error._

val left: Either[Exception, Int] = Either.Try(1 / 0)
val right: Either[Exception, Int] = Either.Try(1)

left.map(_ => 2)
right.map(_ => 2)

left.flatMap(_ => Left(new RuntimeException))
right.flatMap(_ => Right(2))

left.orElse(Right(-1))
right.orElse(Right(2))

left.map2(left)((a: Int, b: Int) => a + b)
left.map2(right)((a: Int, b: Int) => a + b)
right.map2(right)((a: Int, b: Int) => a + b)

right.map2_1(right)((a: Int, b: Int) => a + b)


Either.sequence(List(left))
Either.sequence(List(left, right))
Either.sequence(List(right))


Either.traverse(List(left))(a => Right(-1))
Either.traverse(List(left, right))(a => Right(-1))
Either.traverse(List(right))(a => Left(1))