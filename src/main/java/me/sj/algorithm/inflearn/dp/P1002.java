package me.sj.algorithm.inflearn.dp;

import java.util.Scanner;

/**
 * 돌다리 건너기
 * 철수는 학교에 가는데 개울을 만났습니다. 개울은 N개의 돌로 다리를 만들어 놓았습니다.
 * <p>
 * 철수는 돌 다리를 건널 때 한 번에 한 칸 또는 두 칸씩 건너뛰면서 돌다리를 건널 수 있습니다.
 */
public class P1002 {
    static int[] dy;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P1002 p1002 = new P1002();
        // N개 집합의 원소
        int n = in.nextInt();
        dy = new int[n + 2];

        int answer = p1002.solutionMine(n);
        System.out.println(answer);
    }

    public int solutionMine(int n) {
        // 1번 계단까지 가는 방법의 수
        dy[1] = 1;
        // 2번 계단까지 가는 방법의 수
        dy[2] = 2;

        for (int i = 3; i <= n+1; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }

        return dy[n+1];
    }
}
