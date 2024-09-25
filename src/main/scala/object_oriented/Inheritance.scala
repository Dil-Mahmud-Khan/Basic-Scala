package object_oriented

class Coin(amount: Int):
  def amountCoins: Int = amount


case class GoldValue(amount: Int):
  def +(otherGoldValue: GoldValue): GoldValue = GoldValue(this.amount + otherGoldValue.amount)

  override def toString: String = s"Gold value of $amount"


case class USDollar(amount: Int) extends Coin(amount)

case class CanadianDollar(amount: Int) extends Coin(amount)

case class Euro(amount: Int) extends Coin(amount)

case class Pound(amount: Int) extends Coin(amount)

object Inheritance {
  given coinToGold: Conversion[Coin, GoldValue] with
    def apply(coin: Coin): GoldValue = GoldValue(coin.amountCoins)

  def computeAmountGoldValue[T <: Coin](coins: T*)(using goldConverter: Coin => GoldValue): GoldValue =
    coins.map(goldConverter(_)).reduce(_ + _)

  val amount: GoldValue = computeAmountGoldValue(
    USDollar(5), CanadianDollar(4), Euro(9), Pound(23)
  )
}
