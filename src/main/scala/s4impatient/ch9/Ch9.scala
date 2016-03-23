package s4impatient.ch9

import java.io.{File, FilenameFilter}

import scala.io.Source

object Ch9 {

  def readLines() = {
    val source = Source.fromFile("/home/dp/projects/fpinscala/src/main/resources/myfile.txt", "UTF-8")

    val split = source.mkString.split("\\s+")
    val sorted = split.sorted

    println(sorted.deep)
    source.close
  }

  def subdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs(_))
  }
}
