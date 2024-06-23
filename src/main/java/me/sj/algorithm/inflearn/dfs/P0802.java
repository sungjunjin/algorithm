package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 바둑이 승차 DFS
 */
public class P0802 {
    static int n;
    static int c;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0802 p0802 = new P0802();

        // C 킬로그램 넘게 태울수가 없다
        c = in.nextInt();

        // N 마리의 바둑이들
        n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int answer = p0802.dfs(0, 0, arr);
        System.out.println(answer);
    }

    public int dfs(int level, int sum, int[] arr) {
        if (sum > c) return 0;
        if (level == n) {
            if (sum < c) {
                return sum;
            }
        } else {
            return Math.max(dfs(level + 1, sum + arr[level], arr), dfs(level + 1, sum, arr));
        }

        return 0;
    }
}
