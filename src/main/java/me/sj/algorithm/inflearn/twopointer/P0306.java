package me.sj.algorithm.inflearn.twopointer;

import java.util.*;

/**
 * 최대 길이 연속부분수열
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 * <p>
 * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
 * <p>
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * <p>
 * 여러분이 만들 수 있는 1이 연속된 연속부분수열은
 * <p>
 * 이며 그 길이는 8입니다.
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
