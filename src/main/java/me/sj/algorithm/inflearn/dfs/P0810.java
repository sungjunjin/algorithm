package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 미로탐색 (DFS)
 */
public class P0810 {
    static int[][] board = new int[8][8];

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int answer = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0810 p0810 = new P0810();

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = in.nextInt();
            }
        }

        // 출발점 체크
        board[1][1] = 1;

        p0810.dfs(1, 1);

        System.out.println(answer);
    }

    public void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                // 갈 수 있는 지점 확인
                if (nextX >= 1 && nextX <= 7 && nextY >= 1 && nextY <= 7 && board[nextX][nextY] == 0) {
                    board[nextX][nextY] = 1;
                    dfs(nextX, nextY);
                    board[nextX][nextY] = 0;
                }
            }
        }
    }
}
