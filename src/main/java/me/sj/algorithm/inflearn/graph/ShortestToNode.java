package me.sj.algorithm.inflearn.graph;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 그래프 최단거리 (BFS)
 */
public class ShortestToNode {
    static int n;
    static int m;
    static int[] ch;
    static int[] dis;
    static ArrayList<ArrayList<Integer>> graph;
    static int level = 0;

    public static void main(String[] args) {
        ShortestToNode route = new ShortestToNode();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new ArrayList<>();
        ch = new int[n + 1];
        dis = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graph.get(a).add(b);
        }

        Queue<Integer> queue = new LinkedList<>();
        ch[1] = 1;
        queue.add(1);

        route.solutionLecture(queue);
    }

    public void solutionMine(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            int levelNodeSize = queue.size();
            for (int i = 0; i < levelNodeSize; i++) {
                int num = queue.poll();
                System.out.println(num + " : " + level);

                for (int a : graph.get(num)) {
                    if (ch[a] == 0) {
                        ch[a] = 1;
                        queue.add(a);
                    }
                }
            }

            level++;
        }
    }

    public void solutionLecture(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int a : graph.get(current)) {
                if (ch[a] == 0) {
                    ch[a] = 1;
                    queue.add(a);

                    // 거리 1 추가
                    dis[a] = dis[current] + 1;
                }
            }
        }

        for (int i = 2; i < dis.length; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
