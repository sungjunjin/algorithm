package me.sj.algorithm.inflearn.twopointer;

import java.util.*;

/**
 * 최대 매출 (Sliding Window)
 */
public class P0303 {
    public static void main(String[] args) {
        P0303 p0303 = new P0303();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int days = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p0303.solutionLecture(arr, days));
    }

    /**
     * 시간 초과 풀이 O(n^2)
     */
    public int solutionMine(int[] arr, int days) {
        int answer = 0;
        int index = 0;

        while (index + days < arr.length) {
            int temp = 0;

            for (int i = 0; i < days; i++) {
                temp += arr[index + i];
            }

            if (answer < temp) {
                answer = temp;
            }

            index++;
        }
        return answer;
    }

    public int solutionLecture(int[] arr, int days) {
        int answer = 0;
        int sum = 0;

        // 첫번째 Window를 만든다
        for (int i = 0; i < days; i++) {
            sum += arr[i];
        }

        answer = sum;

        // Sliding Window 시작
        for (int i = days; i < arr.length; i++) {
            sum += arr[i] - arr[i - days];
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
