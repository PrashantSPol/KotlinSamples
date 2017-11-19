package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
abstract class Vehicle

class CompanionExample {
    private class RoadVehicle : Vehicle()

    companion object {
        fun getVehicle() : Vehicle{
            return RoadVehicle()
        }

        @JvmStatic
        fun getVehicleStatic() : Vehicle {
            return RoadVehicle()
        }
    }

}