package me.sj.algorithm.inflearn.twopointer;

import java.util.*;

/**
 * 최대 길이 연속부분수열
 */
public class P0306 {
    public static void main(String[] args) {
        P0306 p0306 = new P0306();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int answer = p0306.solutionLecture(arr, k);

        System.out.println(answer);
    }

    public int solutionMine(int[] arr, int k) {
        int answer = 0;

        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            if (arr[rt] == 1) {
                sum++;

                // rt == 0
            } else {
                // arr[rt]를 1로 바꿈
                if (k >= 2) {
                    k--;
                    sum++;
                    // 1로 못바꾸면
                } else {
                    lt++;

                    if (arr[lt] == 1) {
                        k++;
                    } else {
                        sum--;
                    }
                }
            }

            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }

    public int solutionLecture(int[] arr, int k) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            if (arr[rt] == 0) {
                cnt++;

                while (cnt > k) {
                    if (arr[lt] == 0) {
                        cnt--;
                    }

                    lt++;
                }
            }

            // 길이의 최대값 구하기
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }
}
