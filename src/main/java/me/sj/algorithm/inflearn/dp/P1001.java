package me.sj.algorithm.inflearn.dp;

import java.util.Scanner;

/**
 * 계단오르기
 * 철수는 계단을 오를 때 한 번에 한 계단 또는 두 계단씩 올라간다. 만약 총 4계단을 오른다면 그 방법의 수는
 * <p>
 * 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 로 5가지이다.
 * <p>
 * 그렇다면 총 N계단일 때 철수가 올라갈 수 있는 방법의 수는 몇 가지인가?
 */
public class P1001 {
    static int[] dy;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P1001 p1001 = new P1001();
        // N개 집합의 원소
        int n = in.nextInt();
        dy = new int[n + 1];

        int answer = p1001.solutionMine(n);
        System.out.println(answer);
    }

    public int solutionMine(int n) {
        // 1번 계단까지 가는 방법의 수
        dy[1] = 1;
        // 2번 계단까지 가는 방법의 수
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }

        return dy[n];
    }
}
