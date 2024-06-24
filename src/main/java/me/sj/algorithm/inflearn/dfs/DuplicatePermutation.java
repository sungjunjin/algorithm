package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 중복순열 구하기
 */
public class DuplicatePermutation {
    // 1 ~ 자연수 N
    static int n = 0;
    // 중복을 허락하여 M번을 뽑는다
    static int m = 0;
    static int[] pm;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DuplicatePermutation p0803 = new DuplicatePermutation();

        // 문제의 개수 N
        n = in.nextInt();
        // 제한 시간
        m = in.nextInt();
        pm = new int[m];

        p0803.dfs(0);
    }

    public void dfs(int level) {
        if (level == m) {
            System.out.print(pm[0] + ", " + pm[1]);
            System.out.println();
        } else {
            // n가닥으로 뻗어나감
            for (int i = 1; i <= n; i++) {
                pm[level] = i;
                dfs(level + 1);
            }
        }
    }
}
