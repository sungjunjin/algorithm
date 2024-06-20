package me.sj.algorithm.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 크레인 인형뽑기(카카오)
 */
public class P0503 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        P0503 p0503 = new P0503();

        System.out.println(p0503.solutionMine(board, moves));
    }

    public int solutionMine(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                int doll = board[i][m - 1];

                if (doll != 0) {
                    board[i][m - 1] = 0;

                    if(!stack.isEmpty()) {
                        if(stack.peek() == doll) {
                            answer += 2;
                            stack.pop();
                            break;
                        }
                    }

                    stack.push(doll);
                    break;
                }
            }
        }

        return answer;
    }
}
