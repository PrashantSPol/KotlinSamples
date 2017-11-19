package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
interface Drivable {
    fun drive()
}

class DrivingCar : Drivable {
    override fun drive() {

    }
}

interface Steerable : Drivable {
    fun steer() {
        println("Steering")
    }
}

interface Runnable {
    fun run()
}

class Car : Steerable, Runnable {
    override fun drive() {

    }

    override fun run() {

    }
}
