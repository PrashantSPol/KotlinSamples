package _3_control

/**
 * Created by prashantspol on 11/9/2017.
 */
fun simpleFor() {
    for (i in 1..100) {
        println(i)
    }
}

fun reverseFor() {
    for (i in 100 downTo 1 step 10) {
        println(i)
    }
}

fun collection(collection: Collection<Int>) {
    for (i in collection) {
        println(i)
    }
}

fun map(map:Map<String, String>) {
    for ((k, v) in map) {
        println("Key is $k Value is $v")
    }
}