import guide.Futures
import guide.Futures.Water

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

val cappuccino = Futures.prepareCappuccino

cappuccino.onComplete {
  case Success(foo) => println(foo)
  case Failure(e) => println(e)
}

Futures.heatWater(Water(20)).map { water =>
  println("got some water")
  (10 to 80).contains(water.temperature)
}

Thread.sleep(3000)
