package me.sj.algorithm.inflearn.sort;

import java.util.Scanner;

/**
 * 버블 정렬
 */
public class P0602 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0602 p0602 = new P0602();
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int a : p0602.solutionMine(arr)) {
            System.out.print(a + " ");
        }
    }

    public int[] solutionMine(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public int[] solutionLecture(int[] arr) {

        return arr;
    }
}
