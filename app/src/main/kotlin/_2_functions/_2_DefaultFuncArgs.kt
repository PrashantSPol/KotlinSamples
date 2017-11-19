package _2_functions

/**
 * Created by prashantspol on 11/9/2017.
 */

class _2_DefaultFuncArgs {

    @JvmOverloads
    fun find(array:IntArray,
             startIndex: Int = 0,
             endIndex: Int = array.size - 1,
             searchItem: Int = 1) {


        // implementation for search
    }

    fun call() {
        var arr = intArrayOf()
        find(arr)

        find(array= arr, searchItem = 1, endIndex = 6, startIndex = 0)
    }
}