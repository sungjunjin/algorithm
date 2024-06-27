package me.sj.algorithm.inflearn.greedy;

import java.util.*;

/**
 * 원더랜드(최소스패닝트리 - PriorityQueue)
 * 원더랜드에 문제가 생겼다. 원더랜드의 각 도로를 유지보수하는 재정이 바닥난 것이다.
 * <p>
 * 원더랜드는 모든 도시를 서로 연결하면서 최소의 유지비용이 들도록 도로를 선택하고 나머지 도로는 폐쇄하려고 한다.
 * <p>
 * 아래의 그림은 그 한 예를 설명하는 그림이다.
 * <p>
 * 위의 지도는 각 도시가 1부터 9로 표현되었고, 지도의 오른쪽은 최소비용 196으로 모든 도시를 연결하는 방법을 찾아낸 것이다.
 **/
public class P0907_1 {
    static class Edge implements Comparable<Edge> {
        int to;
        int cost;

        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    static int[] ch;

    public static void main(String[] args) {
        P0907_1 p0907 = new P0907_1();
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Edge>> edges = new ArrayList<>();
        // 도시의 개수
        int v = in.nextInt();
        ch = new int[v + 1];
        for (int i = 0; i <= v; i++) {
            edges.add(new ArrayList<>());
        }

        // 도로의 개수
        int e = in.nextInt();

        for (int i = 0; i < e; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int cost = in.nextInt();

            edges.get(start).add(new Edge(start, cost));
            edges.get(end).add(new Edge(end, cost));
        }

        System.out.println(p0907.solutionMine(edges));
    }

    public int solutionMine(ArrayList<ArrayList<Edge>> edges) {
        int answer = 0;

        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(1, 0));

        while (!queue.isEmpty()) {
            Edge edge = queue.poll();

            if (ch[edge.to] == 0) {
                ch[edge.to] = 1;
                answer += edge.cost;
                for (Edge e : edges.get(edge.to)) {
                    if (ch[e.to] == 0) {
                        queue.offer(new Edge(e.to, e.cost));
                    }
                }
            }
        }

        return answer;
    }
}
