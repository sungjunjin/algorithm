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
        DuplicatePermutation duplicatePermutation = new DuplicatePermutation();

        n = in.nextInt();
        m = in.nextInt();
        pm = new int[m];

        duplicatePermutation.dfs(0);
    }

    public void dfs(int level) {
        if (level == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                pm[level] = i + 1;
                dfs(level + 1);
            }
        }
    }
}
