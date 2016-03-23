package scalania.wordcount

import java.io.File

import scala.io.{Codec, Source}

object WordCount {
  implicit val codec = Codec.UTF8

  def listFiles(dir: File): Array[File] = {
    val files = dir.listFiles
    val scalas = files.filter(_.getName.endsWith(".scala"))
    scalas ++ files.filter(_.isDirectory).flatMap(listFiles(_))
  }

  def wc(file: File): Map[String, Int] = {
    Source.fromFile(file)
      .getLines
      .flatMap(_.split("\\W+"))
      .foldLeft(Map.empty[String, Int]) {
        (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
      }
  }

  def wcs(files: Array[File]) = {
    val maps = files.map(wc(_))
    println(maps.toList)
    maps.foldLeft(Map.empty[String, Int]) {
      (left, right) => (left.keySet ++ right.keySet).map(i => (i, left.getOrElse(i, 0) + right.getOrElse(i, 0))).toMap
    }
  }
}
