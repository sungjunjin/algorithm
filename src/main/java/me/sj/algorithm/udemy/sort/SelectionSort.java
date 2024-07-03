package me.sj.algorithm.udemy.sort;

public class SelectionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];

            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
