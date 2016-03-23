import s4impatient.ch4.FooCh4

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.JavaConversions.propertiesAsScalaMap

val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
val scoresMutable = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
val scoresEmpty = new scala.collection.mutable.HashMap[String, Int]

scores("Bob")
//scoresMutable("Foo) = 69

scoresMutable += ("Bob" -> 1, "Fred" -> 7)
scoresMutable -= "Alice"

val newScores = scores + ("Bob" -> 1, "Fred" -> 7)

scores - "Alice"

scores.keySet


val scoresSorted = scala.collection.immutable.SortedMap("Alice" -> 10,
  "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)

val scores2: scala.collection.mutable.Map[String, Int] =
  new java.util.TreeMap[String, Int]

val props: scala.collection.Map[String, String] = System.getProperties()
val longestKey = props.keySet.foldLeft("")((acc: String, s: String) => if (acc.length > s.length) acc else s).length
val t = (1, 3.14, "Fred")
val (first, second, third) = t
"New York".partition(_.isUpper)
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
symbols.zip(counts)
FooCh4.gizmos(Map("a" -> 1, "b" -> 2))
FooCh4.readFile()
FooCh4.readFileImmutable()
FooCh4.readFileSorted()
FooCh4.props()

FooCh4.minmax(Array(3, -1, 2, 0))

FooCh4.lteqgt(Array(3, -1, 2, 0, 0, 22, -1, -2), 0)

"Hello".zip("World")

