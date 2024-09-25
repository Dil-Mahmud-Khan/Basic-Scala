package functional

import scala.util.Random

// TODO: Complete the expressions marked as ???.

case class Euro(value: Double):
  def +(anotherEuro: Euro): Euro =
    Euro(this.value + anotherEuro.value)

object Operations extends App{
  val randomNumbers: IndexedSeq[Int] = for _ <- 1 to 10 yield Random.nextInt()

  val incrementedNumbers: List[Int] = ???
  val evenNumbers: List[Int] = ???
  val sumEvenNumbers: Int = ???

  val euros: List[Euro] = List(Euro(3.5), Euro(2), Euro(6), Euro(8.2))
  val totalEuros: Euro = ???
}
