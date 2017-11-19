package _1_variables

import com.polstech.kotlinsamples._1_variables.Car

/**
 * Created by prashantspol on 11/9/2017.
 */


class CarKt(private var model : String, val dieselEngine:Boolean) {
    var color : String = "yellow"
    private val mirrors = 2
    lateinit var abc:String
    val tyre  = "abc"

    init {
        val car = Car("red", true)
        car.color = "red"
        print(car.color)
    }
}