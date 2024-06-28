package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 바둑이 승차 DFS
 * 철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.
 * <p>
 * 철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
 * <p>
 * N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.
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
