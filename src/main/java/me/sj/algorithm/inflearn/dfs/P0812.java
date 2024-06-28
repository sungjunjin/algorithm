package me.sj.algorithm.inflearn.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 토마토(BFS)
 * 현수의 토마토 농장에서는 토마토를 보관하는 큰 창고를 가지고 있다.
 *
 * 토마토는 아래의 그림과 같이 격자 모양 상자의 칸에 하나씩 넣어서 창고에 보관한다.
 *
 * 창고에 보관되는 토마토들 중에는 잘 익은 것도 있지만, 아직 익지 않은 토마토들도 있을 수 있다. 보관 후 하루가 지나면,
 *
 * 익은 토마토들의 인접한 곳에 있는 익지 않은 토마토들은 익은 토마토의 영향을 받아 익게 된다.
 *
 * 하나의 토마토의 인접한 곳은 왼쪽, 오른쪽, 앞, 뒤 네 방향에 있는 토마토를 의미한다. 대각선 방향에 있는 토마토들에게는 영향을 주지 못하며,
 *
 * 토마토가 혼자 저절로 익는 경우는 없다고 가정한다. 현수는 창고에 보관된 토마토들이 며칠이 지나면 다 익게 되는지, 그 최소 일수를 알고 싶어 한다.
 *
 * 토마토를 창고에 보관하는 격자모양의 상자들의 크기와 익은 토마토들과 익지 않은 토마토들의 정보가 주어졌을 때,
 *
 * 며칠이 지나면 토마토들이 모두 익는지, 그 최소 일수를 구하는 프로그램을 작성하라. 단, 상자의 일부 칸에는 토마토가 들어있지 않을 수도 있다.
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
