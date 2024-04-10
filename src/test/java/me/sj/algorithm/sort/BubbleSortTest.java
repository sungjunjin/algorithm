package me.sj.algorithm.sort;

import org.junit.jupiter.api.Test;

class SortTest {
    @Test
    public void bubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] intArray = {1,4,5,7,8,2};

        bubbleSort.sort(intArray);

        for(int i: intArray) {
            System.out.print(i + ", ");
        }
    }

}