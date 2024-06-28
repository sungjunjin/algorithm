package me.sj.algorithm.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 미로의 최단거리 통로(BFS)
 * 7*7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 작성하세요.
 * <p>
 * 경로의 길이는 출발점에서 도착점까지 가는데 이동한 횟수를 의미한다.
 * <p>
 * 출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 도로이다.
 * <p>
 * 격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면
 * <p>
 * 위와 같은 경로가 최단 경로의 길이는 12이다.
 */
public class P0811 {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] board = new int[8][8];
    static int[][] dis = new int[8][8];

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0811 p0811 = new P0811();

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = in.nextInt();
            }
        }

        // 출발점 체크
        board[1][1] = 1;

        p0811.bfs(1, 1);

        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }
    }

    public void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));

        board[x][y] = 1;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                if (nextX >= 1 && nextX <= 7 && nextY >= 1 && nextY <= 7 && board[nextX][nextY] == 0) {
                    // 방문 체크
                    board[nextX][nextY] = 1;
                    queue.offer(new Point(nextX, nextY));

                    // 누적 거리 업데이트
                    dis[nextX][nextY] = dis[point.x][point.y] + 1;
                }
            }
        }
    }
}
