package me.sj.algorithm.inflearn.array;

import java.util.Scanner;

/**
 * 가위 바위 보
 */
public class P0103 {
    public static void main(String[] args) {
        P0103 p0103 = new P0103();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        for (char c : p0103.solutionMine(a, b)) {
            System.out.println(c);
        }
    }

    public char[] solutionMine(int[] a, int[] b) {
        char[] answer = new char[a.length];

        for (int i = 0; i < answer.length; i++) {
            // A를 기준
            if (a[i] == 1) {
                // A가 가위
                if (b[i] == 1) {
                    // 가위
                    answer[i] = 'D';
                } else if (b[i] == 2) {
                    // 바위
                    answer[i] = 'B';
                } else {
                    // 보
                    answer[i] = 'A';
                }
            } else if (a[i] == 2) {
                // A가 바위
                if (b[i] == 1) {
                    // 가위
                    answer[i] = 'A';
                } else if (b[i] == 2) {
                    // 바위
                    answer[i] = 'D';
                } else {
                    // 보
                    answer[i] = 'B';
                }
            } else {
                // A가 보
                if (b[i] == 1) {
                    // 가위
                    answer[i] = 'B';
                } else if (b[i] == 2) {
                    // 바위
                    answer[i] = 'A';
                } else {
                    // 보
                    answer[i] = 'D';
                }

            }
        }
        return answer;
    }
}
