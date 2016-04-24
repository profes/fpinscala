import java.util.concurrent.TimeUnit

import guide.Futures
import guide.Futures.Water

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success}

val cappuccino = Futures.prepareCappuccino

Futures.heatWater(Water(20)).map { water =>
  println("got some water")
  (10 to 80).contains(water.temperature)
}

Await.ready(cappuccino, Duration.create(10, TimeUnit.SECONDS))
