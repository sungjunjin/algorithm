package me.sj.algorithm.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 송아지 찾기 1 (BFS)
 */
public class P0708 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();

        P0708 p0708 = new P0708();

        System.out.println(p0708.solutionMine(s, e));
    }

    public int solutionMine(int s, int e) {
        // 움직일 수 있는 거리
        int[] distance = {1, -1, 5};

        // 이미 방문한 위치를 저장하는 체크 배열
        int[] check = new int[10001];

        Queue<Integer> queue = new LinkedList<>();

        return bfs(s, e, check, queue, distance);
    }

    public int bfs(int s, int e, int[] ch, Queue<Integer> queue, int[] dis) {
        // 시작 지점 체크 배열에 삽입
        ch[s] = 1;

        queue.offer(s);

        // 몇 번째(level)에 송아지가 있는지
        int level = 0;

        while (!queue.isEmpty()) {
            // 같은 레벨의 노드수를 가져옴
            int len = queue.size();

            // 노드 수 별로 돌면서 순회
            for (int i = 0; i < len; i++) {
                int num = queue.poll();

                // 움직일 수 있는 거리만큼 송아지 위치 확인
                for (int di : dis) {
                    int child = num + di;

                    // 송아지를 찾으면
                    if (child == e) {
                        return level + 1;
                    }

                    // 송아지를 못찾으면
                    if (child >= 1 && child <= 10000 && ch[child] == 0) {
                        // 이미 방문한 값 방문 체크
                        ch[child] = 1;

                        // 큐에 삽입
                        queue.offer(child);
                    }
                }
            }

            level++;
        }

        return 0;
    }

}
