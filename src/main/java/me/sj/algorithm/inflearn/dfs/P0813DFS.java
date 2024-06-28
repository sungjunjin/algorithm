package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 섬나라 아일랜드 (DFS)
 * N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
 * <p>
 * 각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
 * <p>
 * 섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.
 */
public class P0813DFS {

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
        P0813DFS p0813 = new P0813DFS();

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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    dfs(new Point(i, j));
                }
            }
        }
    }

    public void dfs(Point point) {
        if (board[point.x][point.y] == 0) {
            return;
        } else {
            for (int i = 0; i < 8; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
                    board[point.x][point.y] = 0;
                    dfs(new Point(nextX, nextY));
                }
            }
        }
    }
}
