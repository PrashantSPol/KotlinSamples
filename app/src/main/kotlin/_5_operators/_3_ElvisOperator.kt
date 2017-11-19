package _5_operators

/**
 * Created by prashantspol on 11/10/2017.
 */

fun elvisCheck(nullableString: String?) {
    var len = nullableString?.length ?: -1

    len = if(nullableString != null) {
        nullableString.length
    } else {
        -1
    }


    var two = null ?: 2
}