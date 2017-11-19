package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
open class Bike {
    fun drive() {

    }

    open fun accelerate(){

    }
}

open class SportsBike : Bike() {
//    override fun drive() {
//
//    }

    final override fun accelerate() {
    }
}

class superSportsBike : SportsBike() {

//    override fun accelerate() {
//
//    }
}