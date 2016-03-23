import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

import s4impatient.ch3.Foo3
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.mutable.ArrayBuffer

val b = ArrayBuffer[Int]()

b += 1

for (i <- (0 until 10).reverse) yield i

val a = Array(6, 1, 8, 2, 3, 4, 5)
a.sum
a.max
a.sorted
a.mkString("..")
a.mkString("<", "..", ">")

val arrays = Array.ofDim[Int](3, 4)
//arrays(1)(2) = 4
//arrays.toString

new ProcessBuilder(ArrayBuffer("a", "b", "c"))

Foo3.set(99, 10)

Foo3.swap(Array(1, 2, 3, 4, 5, 6))
Foo3.swap(Array(1, 2, 3, 4, 5, 6, 7))

Foo3.filter(Array(5, 2, 3, 0, 2, -1, -4))

Foo3.avg(Array(1, 2, 3, 4, 5))

Foo3.reverse(Array(1, 2, 3, 4, 5))
Foo3.reverse(ArrayBuffer(1, 2, 3, 4, 5))

Foo3.timeZones()

val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
flavors.getNativesForFlavor(DataFlavor.imageFlavor)