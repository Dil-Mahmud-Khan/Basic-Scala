package functional

// TODO: Complete the expressions marked as ???.

case class Budget(funds: Int):
  def +(moreFunds: Budget): Budget =
    Budget(this.funds + moreFunds.funds)

object FunctionReturning extends App {

//  // Base Function
//  val incrementer: Int => (Int => Int) = ???
//
//  // Function Family
//  val incrementerByOne: Int => Int = incrementer(1)
//  val incrementerByThree: Int => Int = incrementer(3)
//  val incrementerByFive: Int => Int = incrementer(5)
//
//  // Base Function
//  val budgetGenerator: Int => (Budget => Budget) = ???
//
//  // Function Family
//  val foodBudget: Budget => Budget = budgetGenerator(100)
//  val partyBudget: Budget => Budget = budgetGenerator(20)
//  val internetBudget: Budget => Budget = budgetGenerator(10)

}
