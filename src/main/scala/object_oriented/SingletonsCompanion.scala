package object_oriented

abstract class DomesticAnimal:
  def sound(): String

class Dog() extends DomesticAnimal:
  override def sound(): String = "Haw!"

class Cat() extends DomesticAnimal:
  override def sound(): String = "Miauw!"

enum Commands:
  case Sit, Up, Come, Go

object Dog:

  import Commands._

  def dog_commands(): List[Commands] = List(Sit, Up, Go)

object Cat:
  def cat_commands(): List[Commands] = List()


object Armadillo:
  def armadillo_commands(): Unit = println("I do not accept to commands")

object SingletonsCompanion {

}
