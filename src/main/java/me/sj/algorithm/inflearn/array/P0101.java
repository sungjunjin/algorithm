package me.sj.algorithm.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 */
public class P0101 {
    public static void main(String[] args) {
        P0101 p0101 = new P0101();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int x : p0101.solutionMine(arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solutionMine(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                arrayList.add(arr[i]);
            }
        }

        return arrayList;
    }

    public ArrayList<Integer> solutionLecture(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                arrayList.add(arr[i]);
            }
        }

        return arrayList;
    }
}
