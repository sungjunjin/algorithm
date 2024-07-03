package me.sj.algorithm.backjoon.dfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다.
 * 한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.
 * <p>
 * 예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자.
 * 1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는 2번과 5번 컴퓨터를 거쳐 3번과 6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다.
 * 하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.
 * <p>
 * 어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.
 */
public class P2606 {
    static int n;
    static int m;
    static boolean[] ch;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        P2606 p1260 = new P2606();
        Scanner in = new Scanner(System.in);

        // 컴퓨터의 수 (노드의 수
        n = in.nextInt();
        ch = new boolean[n + 1];

        // 연결되어 있는 컴퓨터쌍의 수 (무방향 간선 개수)
        m = in.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int from = in.nextInt();
            int to = in.nextInt();

            // 무방향 그래프
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        ch[1] = true;
        p1260.dfs(1);

        int answer = 0;

        for (int i = 2; i < ch.length; i++) {
            if (ch[i]) answer++;
        }

        System.out.println(answer);
    }

    public void dfs(int node) {
        ArrayList<Integer> list = graph.get(node);

        for (int i : list) {
            if (!ch[i]) {
                ch[i] = true;
                dfs(i);
            }
        }
    }
}
