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
    static int answer;
    static int[] dogs;
    static boolean[] visited;

    public static void main(String[] args) {
        P0802 p0802 = new P0802();
        Scanner in = new Scanner(System.in);

        // 최대 무게
        c = in.nextInt();

        // 바둑이 수
        n = in.nextInt();
        dogs = new int[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            dogs[i] = in.nextInt();
        }

        p0802.dfs(0, 0);
        System.out.println(answer);
    }

    public void dfs(int level, int weightSum) {
        if (weightSum > c) {
            return;
        }

        if (level == n) {
            answer = Math.max(answer, weightSum);
        } else {
            dfs(level + 1, weightSum + dogs[level]);
            dfs(level + 1, weightSum);
        }
    }
}
