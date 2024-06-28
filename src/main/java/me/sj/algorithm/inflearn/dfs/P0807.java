package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 조합의 경우수 (메모이제이션)
 * 하지만 여러분은 이 공식을 쓰지않고 다음 공식을 사용하여 재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.
 */
public class P0807 {
    static int n = 0;
    static int r = 0;

    static int[][] dy;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0807 p0807 = new P0807();

        // 동전의 종류 개수 N
        n = in.nextInt();
        // 동전의 종류 배열
        r = in.nextInt();

        dy = new int[35][35];
        System.out.println(p0807.dfs(n, r));
    }

    public int dfs(int n, int r) {
        if (n == r || r == 0) {
            if (dy[n][r] > 0) return dy[n][r];
            return 1;
        } else {
            dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
            return dy[n][r];
        }
    }
}
