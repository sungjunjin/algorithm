package me.sj.algorithm.inflearn.graph;

import java.util.Scanner;

/**
 * 경로탐색 DFS (인접행렬)
 * 방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요
 *
 * 예시)
 * 5 9
 * 1 2
 * 1 3
 * 1 4
 * 2 1
 * 2 3
 * 2 5
 * 3 4
 * 4 2
 * 4 5
 * 답 : 6
 */
public class RouteArray {
    // 정점의 수
    static int n;
    // 간선의 수
    static int m;
    static int answer = 0;
    static int[][] graph;
    static int[] ch;


    public static void main(String[] args) {
        RouteArray routeArray = new RouteArray();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        ch = new int[n + 1];
        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int r = in.nextInt();
            int c = in.nextInt();

            graph[r][c] = 1;
        }

        ch[1] = 1;
        routeArray.dfs(1);

        System.out.println(answer);
    }

    public void dfs(int node) {
        if (node == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[node][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }
    }

}
