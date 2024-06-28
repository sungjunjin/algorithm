package me.sj.algorithm.inflearn.dfs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 최대점수 구하기(DFS)
 * 이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
 * <p>
 * 각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
 * <p>
 * 제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.
 * <p>
 * (해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)
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
