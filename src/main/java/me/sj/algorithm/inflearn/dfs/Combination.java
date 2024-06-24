package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 조합 구하기
 */
public class Combination {
    // 1 ~ 자연수 N
    static int n = 0;
    // 중복을 허락하여 M번을 뽑는다
    static int m = 0;
    static int[] combi;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Combination combination = new Combination();

        // 자연수 n
        n = in.nextInt();
        // r
        m = in.nextInt();

        combi = new int[m];

        combination.dfs(0, 1);
    }

    public void dfs(int level, int num) {
        if (level == m) {
            for (int i : combi) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = num; i <= n; i++) {
                combi[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }
}
