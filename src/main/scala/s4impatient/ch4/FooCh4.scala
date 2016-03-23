package s4impatient.ch4

import java.io.File
import java.util.{Properties, Scanner}

import scala.collection.JavaConverters._
import scala.collection.{mutable, SortedMap}

object FooCh4 {
  def gizmos(m: Map[String, Double]): Map[String, Double] = {
    m.mapValues(_ * .9)
  }

  def readFile(): Map[String, Int] = {
    val scanner = new Scanner(new File("/home/dp/projects/fpinscala/src/main/resources/myfile.txt"))

    val map = scala.collection.mutable.Map[String, Int]()
    while (scanner.hasNext()) {
      val line = scanner.next()
      val split = line.split(" ")
      split.foreach(s => {
        val i = map.getOrElse(s, 0)
        map(s) = i + 1
      })
    }
    scanner.close()

    map.toMap
  }

  def readFileImmutable(): Map[String, Int] = {
    val scanner = new Scanner(new File("/home/dp/projects/fpinscala/src/main/resources/myfile.txt"))

    var map = Map[String, Int]()
    while (scanner.hasNext()) {
      val line = scanner.next()
      val split = line.split(" ")
      split.foreach(s => {
        map = map + (s -> (1 + map.getOrElse(s, 0)))
      })
    }
    map
  }

  def readFileSorted(): SortedMap[String, Int] = {
    SortedMap(readFileImmutable().toArray: _*)
  }

  def props(): String = {
    import scala.collection.JavaConversions.propertiesAsScalaMap
    val props: scala.collection.Map[String, String] = System.getProperties()
    val longestKey = props.keySet.foldLeft("")((acc: String, s: String) => if (acc.length > s.length) acc else s).length

    props map { case (k, v) => k.padTo(longestKey + 2, " ").mkString + "| " + v} mkString "\n"
  }

  def minmax(values: Array[Int]): (Int, Int) =
    (values.min, values.max)

  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) =
    (values.filter(_ < v).length, values.filter(_ == v).length, values.filter(_ > v).length)
}
