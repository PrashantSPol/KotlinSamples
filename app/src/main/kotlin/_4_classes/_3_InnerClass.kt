package _4_classes

/**
 * Created by prashantspol on 11/10/2017.
 */
class OneClass {
    var name : String = "abc"

    class InnerClass(newName: String) {
        fun changeName(newName: String) {
            // name = newName
        }
    }
}


class AnotherClass {
    var name : String = "abc"

    inner class InnerClass {
        fun changeName(newName: String) {
            name = newName
        }
    }
}