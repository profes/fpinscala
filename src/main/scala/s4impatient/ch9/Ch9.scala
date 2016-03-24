package s4impatient.ch9

import java.io.{File, FileOutputStream, FileWriter, FilenameFilter}

import scala.io.Source
import scala.language.postfixOps

object Ch9 {
  val f = "/home/dp/projects/fpinscala/src/main/resources/myfile.txt"

  val toReverse = "/home/dp/projects/fpinscala/src/main/resources/toReverse.txt"
  val reversed = "/home/dp/projects/fpinscala/src/main/resources/reversed.txt"

  val tabs = "/home/dp/projects/fpinscala/src/main/resources/tabs.txt"

  val floats = "/home/dp/projects/fpinscala/src/main/resources/floats.txt"

  def readLines() = {
    val source = Source.fromFile(f, "UTF-8")

    val split = source.mkString.split("\\s+")
    val sorted = split.sorted

    println(sorted.deep)
    source.close
  }

  def subdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs(_))
  }

  def reverse() = {
    val os = new FileWriter(reversed)

    val source = Source.fromFile(toReverse)
    source.getLines().toSeq.reverse.foreach { l =>
      os.write(l)
      os.write("\n")
    }

    os.close
    source.close
  }

  def replaceTabs() = {
    val reg = """[\t]"""r

    val s = Source.fromFile(tabs)
      .getLines
      .map(line => reg.replaceAllIn(line, " "))
      .mkString("\n")
    s
  }

  def printLongWords(length: Int = 10) = {
    Source.fromFile(f).getLines().flatMap(_.split("\\s")).filter(_.length >= length).toList.sorted
  }

  def onlyFloats() = {
    val numbers = Source.fromFile(floats).getLines().map(_.toDouble).toList

    (numbers.sum, numbers.sum / numbers.size, numbers.min, numbers.max)
  }


}
