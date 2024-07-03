package me.sj.algorithm.udemy.sort;

public class BubbleSort {
    public void sort(int [] intArray) {
        for (int j = 1; j < intArray.length - 1; j++) {
            for (int i = 0; i < intArray.length - j; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                }
            }
        }
    }
}
