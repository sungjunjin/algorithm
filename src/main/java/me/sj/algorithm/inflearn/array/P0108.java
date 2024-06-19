package me.sj.algorithm.inflearn.array;

import java.util.*;

/**
 * 점수 계산
 */
public class P0108 {
    public static void main(String[] args) {
        P0108 p0108 = new P0108();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(p0108.solutionLecture(n, arr));

    }

    public int solutionMine(int n, int[][] arr) {
        int answer = 0;

        return answer;
    }

    public int solutionLecture(int n, int[][] arr) {
        // 행의 합
        int sum1 = 0;

        // 열의 합
        int sum2 = 0;


        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = 0;
        sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
}
