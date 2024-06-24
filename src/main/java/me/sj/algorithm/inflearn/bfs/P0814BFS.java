package me.sj.algorithm.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 섬나라 아일랜드 (DFS)
 */
public class P0814BFS {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] board;

    // 대각선 시계방향
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int n;

    static int answer = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0814BFS p0813 = new P0814BFS();

        n = in.nextInt();

        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }

        p0813.solution();

        System.out.println(answer);
    }

    public void solution() {
        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    queue.offer(new Point(i,j));
                    bfs(queue);
                }
            }
        }
    }

    public void bfs(Queue<Point> queue) {
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n && board[nextX][nextY] == 1) {
                    board[nextX][nextY] = 0;
                    queue.add(new Point(nextX, nextY));
                }
            }
        }
    }
}
