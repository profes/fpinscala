package s4impatient.ch8

class BankAccount(initialBalance: Double) {
  protected var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }

  override def toString = s"BankAccount($balance)"
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  override def deposit(amount: Double) = {
    balance -= 1
    super.deposit(amount)
  }

  override def withdraw(amount: Double) = {
    balance -= 1
    super.withdraw(amount)
  }

  override def toString = s"CheckingAccount($balance)"
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  var freeOperations = 3

  def earnMonthlyInterest() = {
    freeOperations = 3
    balance += balance * 0.02 / 12
    balance
  }

  override def deposit(amount: Double) = {
    commission()
    super.deposit(amount)
  }

  override def withdraw(amount: Double) = {
    commission()
    super.withdraw(amount)
  }

  private def commission() = {
    if (freeOperations <= 0)
      balance -= 1

    freeOperations -= 1
  }

  override def toString = s"SavingsAccount($balance)"
}

abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(override val price: Double, override val description: String) extends Item {
  override def toString = s"SimpleItem($price, $description)"
}

class Bundle(val items: Seq[Item]) extends Item {
  override def price: Double = items.map(_.price).sum

  override def description: String = items.map(_.description).mkString(", ")
}

class Point(val x: Int, val y: Int)
class LabeledPoint(val label: String, override val x: Int, override val y: Int) extends Point(x, y)

abstract class Shape {
  def centerPoint: Double
}

class Rectangle(val x: Int, val y: Int) extends Shape {
  override def centerPoint: Double = x / 2 + x / 2
}

class Circle(val r: Int) extends Shape {
  override def centerPoint: Double = r / 2
}

class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)

  override def toString = s"Creature($range, ${env.length})"
}

class Ant extends Creature {
  override val range = 2
}


