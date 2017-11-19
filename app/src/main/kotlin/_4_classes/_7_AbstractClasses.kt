package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
abstract class AbstractClass {
    abstract var name : String
    abstract fun check()
}

class ImplClass : AbstractClass() {
    override var name: String = "hello"

    override fun check() {
    }

}