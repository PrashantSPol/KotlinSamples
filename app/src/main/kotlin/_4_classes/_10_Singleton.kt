package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
object SingletonClass : Any() {
    val name = "name"
    fun check() {
    }
}

fun check() {
    SingletonClass.name
    SingletonClass.check()
}