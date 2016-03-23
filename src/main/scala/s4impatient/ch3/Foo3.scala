package s4impatient.ch3

import java.util.TimeZone

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object Foo3 {

  def set(a: Int, n: Int): Array[Int] = {
    val random = new Random()
    val a = new Array[Int](10)
    for (i <- 0 until a.length) a(i) = random.nextInt(n)
    a
  }

  def swap(a: Array[Int]): Array[Int] = {
    for (i <- 0 until(a.length - a.length % 2, 2)) {
      val t = a(i)
      a(i) = a(i + 1)
      a(i + 1) = t
    }
    a
  }

  def filter(a: Array[Int]): Array[Int] = {
    val b = ArrayBuffer[Int]()
    b ++= a.filter(_ > 0)
    b ++= a.filter(_ <= 0)
    b.toArray
  }

  def avg(a: Array[Double]): Double =
    a.sum / a.length

  def reverse(a: Array[Int]): Array[Int] =
    a.reverse

  def reverse(a: ArrayBuffer[Int]): ArrayBuffer[Int] =
    a.reverse

  def timeZones(): Array[String] = {
    TimeZone.getAvailableIDs.filter(_ startsWith "America/").map(_ replace("America/", "")).sorted
  }
}
