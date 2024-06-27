package me.sj.algorithm.inflearn.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 다익스트라 알고리즘
 * <p>
 * 아래의 가중치 방향그래프에서 1번 정점에서 모든 정점으로의 최소 거리비용을 출력하는 프로그램을 작성하세요. (경로가 없으면 Impossible을 출력한다)
 */
public class Dijkstra {

    /**
     * 간선 정보
     */
    static class Edge implements Comparable<Edge> {
        /**
         * 정점
         */
        public int vex;

        /**
         * 비용
         */
        public int cost;

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }
    }

    static int n, m;
    static int[] dis;
    static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Dijkstra dijkstra = new Dijkstra();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        dis = new int[n + 1];

        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.get(a).add(new Edge(b, c));
        }
    }

    public void solution(int start) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Edge(start, 0));
        dis[start] = 0;

        while (!priorityQueue.isEmpty()) {
            Edge now = priorityQueue.poll();

            if (now.cost > dis[now.vex]) {
                continue;
            }

            // 큐에서 꺼낸 간선과 연결된 모든 간선정보를 순회한다
            for (Edge edge : graph.get(now.vex)) {
                int movingCost = now.cost + edge.cost;

                // 해당 간선으로 가는 최소 비용을 구해 큐에 넣어준다
                if (dis[edge.vex] > movingCost) {
                    dis[edge.vex] = movingCost;
                    priorityQueue.offer(new Edge(edge.vex, movingCost));
                }
            }
        }
    }
}
