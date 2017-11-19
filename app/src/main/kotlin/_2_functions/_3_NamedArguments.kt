package _2_functions

/**
 * Created by prashantspol on 11/9/2017.
 */
class _3_NamedArguments {
    @JvmOverloads
    fun find(array:IntArray,
             startIndex: Int = 0,
             endIndex: Int = array.size - 1,
             searchItem: Int = 1) {
        // implementation for search
    }

    fun call() {
        var array = intArrayOf()
        find(startIndex = 1, endIndex = 5, array = array, searchItem = 5)
    }
}