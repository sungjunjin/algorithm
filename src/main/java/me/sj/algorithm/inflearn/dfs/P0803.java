package me.sj.algorithm.inflearn.dfs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 최대점수 구하기(DFS)
 */
public class P0803 {
    static int m = 0;
    static int n = 0;
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0803 p0803 = new P0803();

        // 문제의 개수 N
        n = in.nextInt();
        // 제한 시간
        m = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            // 점수
            int k = in.nextInt();

            // 시간
            int v = in.nextInt();
            arr[i] = k;
            map.put(k, v);
        }

        int answer = p0803.dfs(0, 0, 0, arr);
        System.out.println(answer);
    }

    public int dfs(int level, int pointSum, int timeSum, int[] arr) {
        if (level == n) {
            if (timeSum > m) return 0;

            return pointSum;
        } else {
            return Math.max(
                    dfs(level + 1, pointSum + arr[level], timeSum + map.get(arr[level]), arr),
                    dfs(level + 1, pointSum, timeSum, arr)
            );
        }
    }
}
