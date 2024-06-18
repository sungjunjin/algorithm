package me.sj.algorithm.inflearn.array;

import java.util.Scanner;

/**
 * 점수 계산
 */
public class P0107 {
    public static void main(String[] args) {
        P0107 p0107 = new P0107();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int answer = p0107.solutionMine(arr);

        System.out.println(answer);
    }

    public int solutionMine(int[] arr) {
        int answer = 0;

        int score = 0;

        for(int a: arr) {
            if(a == 1) {
                score += 1;
                answer += score;
            } else {
                score = 0;
            }
        }

        return answer;
    }

    public int solutionLecture(int[] arr) {
        int answer = 0;

        return answer;
    }
}
