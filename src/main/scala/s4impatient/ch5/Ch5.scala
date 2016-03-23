package s4impatient.ch5

import javax.print.attribute.standard.PrinterMoreInfoManufacturer

import scala.beans.BeanProperty

object Ch5 {

}

class BankAccount {
  private var _balance = 0

  def deposit(n: Int): Unit = {
    _balance += n
  }

  def withdraw(n: Int): Unit = {
    _balance -= n
  }

  def balance = _balance
}

class Time(private val hrs: Int, private val min: Int) {
  def before(time: Time): Boolean = {
    hrs <= time.hrs && min <= time.min
  }
}

class Time2(private val hrs: Int, private val min: Int) {
  private val mins = 24 * hrs + min

  def before(time: Time2): Boolean = {
    mins < time.mins
  }
}

class Student(@BeanProperty var name: String, @BeanProperty var id: Long)

class Person(var age: Int) {
  if (age < 0) age = 0
  override def toString = s"Person($age)"
}

class Person2(name: String) {
  private val split = name.split(" ")
  val firstName = split(0)
  val lastName = split(1)

  override def toString = s"Person2($firstName, $lastName)"
}

class Car(val manufacturer: String, val name: String, val year: Int = -1, var plate: String = "") {

  override def toString = s"Car(manufacturer=$manufacturer, name=$name, year=$year, plate=$plate)"
}