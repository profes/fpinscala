import java.io.File

import s4impatient.ch9.Ch9

Ch9.readLines()

val subdirs = Ch9.subdirs(new File("/home/dp/projects/fpinscala/src/main/"))
for (d <- subdirs) println(d)


val numPattern = "[0-9]+"r

val wsPattern = """\s+[0-9]+\s+"""r

val text = "99 bottles, 98 bottles"

for(matchString <- wsPattern.findAllIn(text))
  println(matchString)

wsPattern.findAllIn(text).toArray

wsPattern.findFirstIn(text)

numPattern.replaceFirstIn(text, "xxx")
numPattern.replaceAllIn(text, "xxx")

val numItemPattern = "([0-9]+) ([a-z]+)"r

val numItemPattern(num, item) = "99 bottles"

for (numItemPattern(num, item) <- numItemPattern.findAllIn("99 bottles, 98 bottles"))
  println(s"$num $item")

Ch9.reverse()

Ch9.replaceTabs()

Ch9.printLongWords(5)

Ch9.onlyFloats()
