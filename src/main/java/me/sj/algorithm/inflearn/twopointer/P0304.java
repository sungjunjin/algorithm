package me.sj.algorithm.inflearn.twopointer;

import java.util.Scanner;

/**
 * 연속 부분수열
 * N개의 수로 이루어진 수열이 주어집니다.
 * <p>
 * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
 * <p>
 * 만약 N=8, M=6이고 수열이 다음과 같다면
 * <p>
 * 1 2 1 3 1 1 1 2
 * <p>
 * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
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
