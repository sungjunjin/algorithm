package me.sj.algorithm.inflearn.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 토마토(BFS)
 */
public class P0812 {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] board;
    static int[][] days;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0812 p0811 = new P0812();

        m = in.nextInt();
        n = in.nextInt();

        board = new int[n][m];
        days = new int[n][m];

        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = in.nextInt();
                if (board[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        p0811.bfs(queue);

        int answer = 0;

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(days[i][j], answer);
                }
            }

            System.out.println(answer);
        } else {
            System.out.println(-1);
        }

    }

    public void bfs(Queue<Point> queue) {
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            // 4가지 방향으로 큐에 넣는다
            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m && board[nextX][nextY] == 0) {
                    board[nextX][nextY] = 1;
                    queue.offer(new Point(nextX, nextY));
                    days[nextX][nextY] = days[point.x][point.y] + 1;
                }
            }
        }
    }
}
