import java.io.File

import akka.dispatch.Futures

import scala.collection.immutable.ListMap
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scalania.wordcount.WordCount

val f = new File("/home/dp/projects/fpinscala-book")
val files = WordCount.listFiles(f).sorted

//WordCount.wc(files(0))

//val count = WordCount.wcFiles(files)
//ListMap(count.toSeq.sortWith(_._2 > _._2):_*)

//WordCount.listHashes(f)

//WordCount.checkout(f, "d763887")

//WordCount.run(f)
