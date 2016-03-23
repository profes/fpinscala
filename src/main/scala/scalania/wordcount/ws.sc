import java.io.File

import scalania.wordcount.WordCount

val f = new File("/home/dp/projects/fpinscala/src/main")
val files = WordCount.listFiles(f).sorted

WordCount.wc(files(0))

WordCount.wcs(files)