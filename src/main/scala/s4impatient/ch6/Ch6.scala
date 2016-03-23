package s4impatient.ch6

object Ch6 {

}

object TrafficLightColor extends Enumeration {
  type TrafficLightColor = Value
  val Red, Green, Yellow = Value
}

abstract class UnitConversion {
  def convert(): UnitConversion
}

object InchesToCentimeters extends UnitConversion {
  override def convert(): UnitConversion = ???
}

object GallonsToLiters extends UnitConversion {
  override def convert(): UnitConversion = ???
}

object MilesToKilometers extends UnitConversion {
  override def convert(): UnitConversion = ???
}

class Point private(x: Int, y: Int)

object Point {
  def apply(x: Int, y: Int) =
    new Point(x, y)
}

object Cards extends Enumeration {
  type Cards = Value
  val Foo = Value("♣")
  val Diamonds = Value("♦")
  val Hearts = Value("♥")
  val Spike = Value("♠")

  def isRed(card: Cards): Boolean = {
    card == Diamonds || card == Hearts
  }
}

object RGB extends Enumeration {
  type RGB = Value
  val Red = Value(0xff0000)
  val Green = Value(0x00ff00)
  val Blue = Value(0x0000ff)
}