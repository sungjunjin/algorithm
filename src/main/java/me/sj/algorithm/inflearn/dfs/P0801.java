package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 합이 같은 부분집합 (DFS: 아마존 인터뷰)
 * N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
 * <p>
 * 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
 * <p>
 * 둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어 합니다.
 * <p>
 * 예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.
 */
public class P0801 {
    static int[] arr;
    static int total = 0;
    static int n = 0;
    static String answer = "NO";

    public static void main(String[] args) {
        P0801 p0801 = new P0801();
        Scanner in = new Scanner(System.in);

        // N개 집합의 원소
        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }

        p0801.dfs(0, 0);
        System.out.println(answer);
    }

    public void dfs(int level, int sum) {
        if (level == n) {
            if (sum == total - sum) {
                answer = "YES";
            }
        } else {
            dfs(level + 1, sum + arr[level]);
            dfs(level + 1, sum);
        }
    }
}
