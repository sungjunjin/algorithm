package me.sj.algorithm.inflearn.array;

import java.util.Scanner;

/**
 * 가위 바위 보
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * <p>
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * <p>
 * 예를 들어 N=5이면
 * <p>
 * <p>
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 */
public class P0203 {
    public static void main(String[] args) {
        P0203 p0203 = new P0203();
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

        for (char c : p0203.solutionMine(a, b)) {
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
