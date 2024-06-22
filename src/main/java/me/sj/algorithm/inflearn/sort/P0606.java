package me.sj.algorithm.inflearn.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 장난꾸러기
 */
public class P0606 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0606 p0606 = new P0606();
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int a : p0606.solutionMine(arr)) {
            System.out.print(a + " ");
        }
    }

    public int[] solutionMine(int[] arr) {
        int[] answer = new int[2];

        // 깊은 복사
        int[] originalArr = arr.clone();
        Arrays.sort(arr);

        int countIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(originalArr[i] != arr[i]) {
                answer[countIdx] = i + 1;
                countIdx++;
            }
        }

        return answer;
    }

    public int[] solutionLecture(int[] arr) {

        return arr;
    }
}
