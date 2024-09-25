package polymorphic_types

// TODO: Complete the expressions marked as ???.

class Animal

class Reptile extends Animal

class Mammal extends Animal

class FourLegs extends Mammal

class Aquatic extends Mammal

class Zebra extends FourLegs

class Dolphin extends Aquatic

class Turtle extends Reptile

//def selection(animal: ???): ??? = animal

object TypeBounds extends App {
    val zebra = new Zebra
    val dolphin = new Dolphin
    val turtle = new Turtle

//    println(selection(zebra))
//    println(selection(dolphin))

// The next selection should give an error
//    println(selection(turtle))
}
