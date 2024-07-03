package me.sj.algorithm.sort;

import me.sj.algorithm.udemy.sort.BubbleSort;
import me.sj.algorithm.udemy.sort.InsertionSort;
import me.sj.algorithm.udemy.sort.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Hashtable;

import static org.assertj.core.api.Assertions.assertThat;

class SortingTest {
    @Test
    public void bubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] intArray = {1,4,5,7,8,2};

        bubbleSort.sort(intArray);

        assertThat(intArray).isEqualTo(new int[]{1,2,4,5,7,8});
    }

    @Test
    public void selectionSort() {
        SelectionSort selectionSort = new SelectionSort();

        int[] intArray = {1,4,5,7,8,2};

        selectionSort.sort(intArray);

        assertThat(intArray).isEqualTo(new int[]{1,2,4,5,7,8});
    }

    @Test
    public void insertionSort() {
        InsertionSort insertionSort = new InsertionSort();

        int[] intArray = {1,4,5,7,8,2};

        insertionSort.sort(intArray);

        assertThat(intArray).isEqualTo(new int[]{1,2,4,5,7,8});

        HashMap<String, String> hashMap = new HashMap<>();
        Hashtable<String, String> hashtable = new Hashtable<>();
    }

}