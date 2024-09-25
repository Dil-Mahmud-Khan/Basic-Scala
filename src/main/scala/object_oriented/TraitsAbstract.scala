package object_oriented

import scala.collection.mutable.ListBuffer

abstract class IntQueue:
  def get(): Int

  def put(x: Int): Unit

class BasicIntQueue extends IntQueue:
  private val buffer: ListBuffer[Int] = new ListBuffer[Int]()

  override def get(): Int = buffer.remove(0)

  override def put(x: Int): Unit = buffer += x

trait Incrementing extends IntQueue:
  abstract override def put(x: Int): Unit = super.put(x + 1)

trait Doubling extends IntQueue:
  abstract override def put(x: Int): Unit = super.put(x * 2)

trait Filtering extends IntQueue:
  abstract override def put(x: Int): Unit = if (x > 0) super.put(x)

object TraitsAbstract {
  val queueDoublingIncrementing = new BasicIntQueue with Incrementing with Doubling
  queueDoublingIncrementing.put(5)
  queueDoublingIncrementing.put(3)
  queueDoublingIncrementing.put(8)

  val queueFilteringDoubling = new BasicIntQueue with Doubling with Filtering
  queueFilteringDoubling.put(0)
  queueFilteringDoubling.put(1)
  queueFilteringDoubling.put(2)
}
