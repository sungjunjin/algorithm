package me.sj.algorithm.inflearn.graph;

import java.util.Scanner;

/**
 * 경로탐색 DFS (인접행렬)
 */
public class RouteArray {
    static int n;
    static int m;
    static int answer = 0;

    static int[][] graph;
    static int[] ch;

    public static void main(String[] args) {
        RouteArray routeArray = new RouteArray();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;
        routeArray.solutionLecture(1);

        System.out.println(answer);
    }

    public void solutionMine(int start) {
        if (start == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if(graph[start][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    solutionMine(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public void solutionLecture(int start) {
        if (start == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[start][i] == 1 && ch[i] == 0) {
                    // 방문했던 노드 체크
                    ch[i] = 1;

                    solutionLecture(i);

                    // 방문했던 에서 다시 제외
                    ch[i] = 0;
                }
            }
        }
    }
}
