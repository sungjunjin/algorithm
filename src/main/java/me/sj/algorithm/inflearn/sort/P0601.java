package me.sj.algorithm.inflearn.sort;

import java.util.Scanner;

/**
 * 선택 정렬
 */
public class P0601 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0601 p0601 = new P0601();
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int a : p0601.solutionMine(arr)) {
            System.out.print(a + " ");
        }
    }

    public int[] solutionMine(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }


        return arr;
    }

    public int[] solutionLecture(int[] arr) {

        return arr;
    }
}
