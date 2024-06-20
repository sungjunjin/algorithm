package me.sj.algorithm.inflearn.hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 매출액의 종류 (해시, Sliding Window)
 */
public class P0405 {
    public static void main(String[] args) {
        P0405 p0405 = new P0405();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p0405.solutionMine(arr, k));

    }

    public int solutionMine(int arr[], int k) {
        int answer = 0;
        // 합산을 저장할 set
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        // 배열에서 랜덤한 3개를 뽑을 때
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : set) {
            cnt++;

            if (cnt == k) {
                return x;
            }
        }

        return -1;
    }
}
