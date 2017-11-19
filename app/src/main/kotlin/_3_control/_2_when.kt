package _3_control

/**
 * Created by prashantspol on 11/9/2017.
 */
fun getAge(name : String): Int {
    return when (name) {
        "A" -> 20
        "B" -> 25
        "C" -> 30
        "D" -> 40
        else -> throw IllegalArgumentException("not valid name")
    }
}

fun validatePassword(password : String) {
    when(password.length) {
        1,2,3 -> println("too short")
        in 4..8 -> println("moderate")
        else -> println("good")
    }
}