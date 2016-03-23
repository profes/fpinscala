import java.io.File

import scala.collection.immutable.ListMap
import scalania.wordcount.WordCount

val f = new File("/home/dp/projects/fpinscala-book")
val files = WordCount.listFiles(f).sorted

WordCount.wc(files(0))

val count = WordCount.wcFiles(files)

ListMap(count.toSeq.sortWith(_._2 > _._2):_*)

//WordCount.listHashes(f)

//WordCount.checkout(f, "d763887")
import scalania.wordcount.WordCount
WordCount.run(f)