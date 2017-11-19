package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
// check equivalent class in Java
data class User(val name: String, val country:String)

fun userEquals() {
    var user1 = User("A", "Japan")
    var user2 = User("B", "Nihon")

    println("Equality is ${user1 == user2}")
}

fun copy() {
    val user1 = User("A", "Japan")

    val user2 = user1.copy(country = "Nihon")
}