package me.sj.algorithm.sort;

public class InsertionSort {
    public void sort(int[] intArray) {

        for (int i = 1; i < intArray.length; i++) {
            while(i > 0 && intArray[i - 1] > intArray[i]) {
                int temp = intArray[i - 1];
                intArray[i-1] = intArray[i];
                intArray[i] = temp;

                i--;
            }
        }
    }
}
