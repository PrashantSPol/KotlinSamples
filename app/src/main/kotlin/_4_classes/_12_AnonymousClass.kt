package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
fun anonymousFun() {
    val name = "name"

    fun check() : Runnable {
        return object : Runnable {
            override fun run() {
                println("value of name is ${name}")
            }
        }
    }
}