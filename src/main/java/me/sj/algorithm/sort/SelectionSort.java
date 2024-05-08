package me.sj.algorithm.sort;

public class SelectionSort {
    public void sort(int[] intArray) {
        for(int index=0;index<intArray.length-1;index++) {
            int min = intArray[index];
            int minIndex = index;

            for(int j=index;j<intArray.length;j++) {

                if(min > intArray[j]) {
                    min = intArray[j];
                    minIndex = j;
                }
            }

            int temp = intArray[index];
            intArray[minIndex] = intArray[index];
            intArray[index] = min;
        }
    }
}
