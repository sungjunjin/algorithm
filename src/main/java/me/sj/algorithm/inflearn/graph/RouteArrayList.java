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
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public static void main(String[] args) {
        RouteArrayList route = new RouteArrayList();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new ArrayList<>();
        ch = new int[n + 1];

        for (int i = 1; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graph.get(a).add(b);
        }

        ch[1] = 1;
        route.solutionLecture(1);

        System.out.println(answer);
    }

    public void solutionMine(int start) {
        if(start == n) {
            answer++;
        } else {
            for(int a : graph.get(start)) {
                if(ch[a] == 0) {
                    ch[a] = 1;
                    solutionMine(a);
                    ch[a] = 0;
                }
            }
        }
    }

    public void solutionLecture(int start) {
        if(start == n) {
            answer++;
        } else {
            for(int next : graph.get(start)) {
                if(ch[next] == 0) {
                    ch[next] = 1;
                    solutionMine(next);
                    ch[next] = 0;
                }
            }
        }
    }
}
