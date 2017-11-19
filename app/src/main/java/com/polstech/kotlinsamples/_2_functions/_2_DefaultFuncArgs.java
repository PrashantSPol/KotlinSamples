package com.polstech.kotlinsamples._2_functions;

/**
 * Created by polprashant on 16/11/17.
 */

public class _2_DefaultFuncArgs {
    public void find(int[] array, int firstElement, int secondElement, int searchItem) {
    }

    public void find(int[] array, int searchItem) {
        find(array, 0, array.length, searchItem);
    }

    public void find(int[] array, int firstElement, int searchItem) {
        find(array, firstElement, array.length, searchItem);
    }


}
