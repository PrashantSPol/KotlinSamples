package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */

// three ways of defining primary constructors
class FirstClass(val type:String, val number:Int) {
}

class SecondClass(type:String, number:Int) {
    val type:String
    val number:Int

    init {
        this.type = type
        this.number = number
    }
}

class ThirdClass(type:String, number: Int) {
    val type:String = type
    val number:Int = number
}

// Empty class
class EmptyClass


// Secondary Constructors
class Person(name:String) {
    var age = 0

    constructor(name: String, age:Int) :this(name) {
        this.age = age
    }
}