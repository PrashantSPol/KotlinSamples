package _5_operators

/**
 * Created by prashantspol on 11/10/2017.
 */

fun nullSafetyCheck() {
    var nullableString: String? = null

    //var l = nullableString.length
    var len = nullableString?.length;

    len = if(nullableString == null) {
        null
    } else {
        nullableString.length
    }
}