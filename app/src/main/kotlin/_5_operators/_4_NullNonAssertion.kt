package _5_operators

/**
 * Created by prashantspol on 11/10/2017.
 */
fun nullNonassertion(name:String?) {
    // to de-reference nullability, used when we are sure that variable value won"t be null
    // this may throw NullPointerException
    var len = name!!.length;
}