package me.sj.algorithm.inflearn.twopointer;

import java.util.Scanner;

/**
 * 연속 부분수열
 */
public class P0304 {
    public static void main(String[] args) {
        P0304 p0304 = new P0304();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int days = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p0304.solutionLecture(arr, days));
    }

    /**
     * 시간 초과 풀이 O(n^2)
     */
    public int solutionMine(int[] arr, int target) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];

                if (sum > target) {
                    break;
                }

                if (sum == target) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }

    /**
     * Two Pointer O(N) 사용
     */
    public int solutionLecture(int[] arr, int target) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];

            if (sum == target) {
                answer++;
            }

            while (sum >= target) {
                sum -= arr[lt++];

                if (sum == target) {
                    answer++;
                }
            }

        }

        return answer;
    }
}
