package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
sealed class Animal(name:String)

class Cat(name:String) : Animal(name)

class Dog(name:String) : Animal(name)

//class Duck(name:String) : Animal(name)

fun check(animal: Animal) : String {
    return when(animal) {
        is Cat -> "cat is here"
        is Dog -> "dog is here"
    }
}