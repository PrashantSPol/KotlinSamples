package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
interface Callable {
    fun call()
}

class Phone : Callable {
    override fun call() {

    }
}

class Tablet(c: Callable) : Callable by c

fun letsCall(tablet : Tablet) {
    tablet.call()
}