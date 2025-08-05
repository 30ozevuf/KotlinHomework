/*
Реалізувати систему класів для опису тварин з використанням абстрактних класів, інтерфейсів і запечатаних класів.

1. Створити абстрактний клас Animal, який має абстрактні методи makeSound() і move().
2. Створити інтерфейс Pet, який має методи play() і feed().
3. Використовуючи запечатані класи, опишіть різні типи тварин: Mammal, Bird і Fish.
4. Створити конкретні класи для кількох тварин (наприклад, Dog, Cat, Parrot, Goldfish), які наслідують абстрактний клас Animal і реалізують інтерфейс Pet, якщо це домашні тварини.
*/


abstract class Animal(val name: String) {
    abstract fun makeSound(): String
    abstract fun move(): String
}

interface Pet {
    fun play(): String
    fun feed(): String
}

sealed class AnimalType {
    class Mammal : AnimalType()
    class Bird : AnimalType()
    class Fish : AnimalType()
}

class Dog(name: String) : Animal(name), Pet {
    override fun makeSound() = "Woof!"
    override fun move() = "Run"
    override fun play() = "Fetch the ball"
    override fun feed() = "Eats dog food"
}

class Cat(name: String) : Animal(name), Pet {
    override fun makeSound() = "Meow!"
    override fun move() = "Walk"
    override fun play() = "Watch onto the window"
    override fun feed() = "Eats cat food"
}

class Parrot(name: String) : Animal(name), Pet {
    override fun makeSound() = "Squak!"
    override fun move() = "Fly"
    override fun play() = "Play with ring"
    override fun feed() = "Eats dog food"
}

class Fish(name: String) : Animal(name) {
    override fun makeSound() = "No sound from Fish"
    override fun move() = "Swim"
}

fun main(){
    val dog = Dog("Buddy Dog")
    val cat = Cat("Tom Cat")
    val parrot = Parrot("Polly Parrot")
    val fish = Fish("Fish")

    val animals: List<Animal> = listOf(dog, cat, parrot, fish)

    animals.forEach { animal ->
        println("${animal.name} says: ${animal.makeSound()} and moves by: ${animal.move()} ")
        if (animal is Pet) {
            println(" ${animal.name} likes ${animal.play()} and ${animal.feed()} ")
        }
    }

}


