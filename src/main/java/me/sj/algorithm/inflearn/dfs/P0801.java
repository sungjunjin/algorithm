package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 합이 같은 부분집합 (DFS: 아마존 인터뷰)
 */
public class P0801 {
    static int total = 0;
    static int n = 0;
    static String answer = "NO";
    static boolean answerAlreadyFound = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // N개 집합의 원소
        n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }

        P0801 p0801 = new P0801();
        p0801.dfs(0, 0, arr);
        System.out.println(answer);
    }

    public void dfs(int level, int sum, int[] arr) {
        if(answerAlreadyFound) return;

        if(level == n) {
            if (sum == (total - sum)) {
                answerAlreadyFound = true;
                answer =  "YES";
            }
        } else {
            dfs(level + 1, sum + arr[level], arr);
            dfs(level + 1, sum, arr);
        }
    }
}
