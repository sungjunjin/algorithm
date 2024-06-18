package me.sj.algorithm.inflearn.array;

import java.util.Scanner;

/**
 * 보이는 학생
 */
public class P0102 {
    public static void main(String[] args) {
        P0102 p0102 = new P0102();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p0102.solutionLecture(arr));
    }

    public int solutionMine(int[] arr) {
        // 앞에는 무조건 보임
        int answer = 1;

        // 그동안 가장 큰 애, 맨 앞 학생의 키로 초기화
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1] && arr[i + 1] > max) {
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
                answer++;
            }
        }

        return answer;
    }

    public int solutionLecture(int[] arr) {
        // 앞에는 무조건 보임
        int answer = 1, max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    }
}
