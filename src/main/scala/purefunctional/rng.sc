import purefunctional.RNG.SimpleRNG
import purefunctional._

val rn = SimpleRNG(2)
val (i, r) = RNG.nonNegativeInt(SimpleRNG(2))
RNG.nonNegativeInt(r)
val (i2, r2) = RNG.double(SimpleRNG(2))
RNG.double(r2)
RNG.intDouble(SimpleRNG(2))
RNG.doubleInt(SimpleRNG(2))
RNG.double3(SimpleRNG(2))
RNG.ints(5)(SimpleRNG(2))
RNG.double2(SimpleRNG(2))
RNG.randDoubleInt(SimpleRNG(2))
RNG._ints(5)(SimpleRNG(2))
RNG.nonNegativeLessThan(5000)(rn)

RNG._map(RNG.int)((i: Int) => i * 2)(rn)
RNG._map2(RNG.int, RNG.double2)((a, b) => i * 2)(rn)

RNG.rollDie(SimpleRNG(5))


val machine: State[Machine, (Int, Int)] = State.simulateMachine(List(Coin, Turn))
machine.run(Machine(true, 10, 10))