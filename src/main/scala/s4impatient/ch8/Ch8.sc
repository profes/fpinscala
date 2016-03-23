import s4impatient.ch8._

val account = new BankAccount(10)
account.deposit(20)

val account1 = new CheckingAccount(10)
account1.deposit(20)

val account2 = new SavingsAccount(10)

account2.deposit(1)
account2.deposit(1)
account2.deposit(1)
account2.deposit(1)

account2.earnMonthlyInterest()

account2.deposit(1)


val item1 = new SimpleItem(1, "a")
val item2 = new SimpleItem(2, "b")
val item3 = new SimpleItem(3, "c")

val bundle = new Bundle(Seq(item1, item2, item3))
bundle.price
bundle.description

new LabeledPoint("foo", 1, 2)


new Rectangle(2, 3)
new Circle(5)

new Ant()