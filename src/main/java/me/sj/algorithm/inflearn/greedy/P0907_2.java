package me.sj.algorithm.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 원더랜드(최소스패닝트리 - Union & Find)
 * 원더랜드에 문제가 생겼다. 원더랜드의 각 도로를 유지보수하는 재정이 바닥난 것이다.
 * <p>
 * 원더랜드는 모든 도시를 서로 연결하면서 최소의 유지비용이 들도록 도로를 선택하고 나머지 도로는 폐쇄하려고 한다.
 * <p>
 * 아래의 그림은 그 한 예를 설명하는 그림이다.
 * <p>
 * 위의 지도는 각 도시가 1부터 9로 표현되었고, 지도의 오른쪽은 최소비용 196으로 모든 도시를 연결하는 방법을 찾아낸 것이다.
 **/
public class P0907_2 {
    static class Edge implements Comparable<Edge> {
        int start;
        int end;
        int cost;

        public Edge(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    static int[] union;

    public static void main(String[] args) {
        P0907_2 p0907 = new P0907_2();
        Scanner in = new Scanner(System.in);

        ArrayList<Edge> edges = new ArrayList<>();
        // 도시의 개수
        int v = in.nextInt();
        union = new int[v+1];

        for(int i=0;i<v;i++) {
            union[i] = i;
        }

        // 도로의 개수
        int e = in.nextInt();

        for (int i = 0; i < e; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int cost = in.nextInt();

            edges.add(new Edge(start, end, cost));
        }

        System.out.println(p0907.solutionMine(edges));
    }

    public static int find(int num) {
        if(union[num] == num) {
            return num;
        } else {
            return union[num] = find(union[num]);
        }
    }

    public static void union(int start, int end) {
        int fa = find(start);
        int fb = find(end);

        if(fa != fb) {
            union[fa] = fb;
        }
    }

    public int solutionMine(ArrayList<Edge> edges) {
        int answer = 0;
        Collections.sort(edges);

        for(Edge e : edges) {
            int edge1 = find(e.start);
            int edge2 = find(e.end);

            if(edge1 != edge2) {
                answer += e.cost;
                union(e.start, e.end);
            }
        }

        return answer;
    }
}
