import java.io.File

import s4impatient.ch9.Ch9

Ch9.readLines()

val subdirs = Ch9.subdirs(new File("/home/dp/projects/fpinscala/src/main/"))

for (d <- subdirs) println(d)