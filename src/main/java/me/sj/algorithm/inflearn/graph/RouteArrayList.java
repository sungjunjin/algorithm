package me.sj.algorithm.inflearn.graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 경로탐색 DFS (인접 리스트)
 */
public class RouteArrayList {
    static int n;
    static int m;
    static int answer = 0;
    // 인접 리스트
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public static void main(String[] args) {
        RouteArrayList route = new RouteArrayList();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new ArrayList<>();
        ch = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int from = in.nextInt();
            int to = in.nextInt();

            graph.get(from).add(to);
        }

        ch[1] = 1;
        route.dfs(1);

        System.out.println(answer);
    }

    public void dfs(int node) {
        if (node == n) {
            answer++;
        } else {
            ArrayList<Integer> list = graph.get(node);

            for (int to : list) {
                if (ch[to] == 0) {
                    ch[to] = 1;
                    dfs(to);
                    ch[to] = 0;
                }
            }
        }
    }
}
