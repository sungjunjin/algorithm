package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 미로탐색 (DFS)
 * 7*7 격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하세요.
 *
 * 출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 통로이다.
 *
 * 격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면
 *
 * 위의 지도에서 출발점에서 도착점까지 갈 수 있는 방법의 수는 8가지이다.
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
