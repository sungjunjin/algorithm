package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 부분집합 구하기 DFS
 */
public class P0706 {
    static int n;
    static int[] ch;

    public void DFS(int l) {
        // ch 배열에 경우의 수가 다 세팅되면
        if (l == n + 1) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();

        } else {
            // 왼쪽 갈래 (사용 함)
            ch[l] = 1;
            DFS(l + 1);

            // 오른쪽 갈래 (사용 안함)
            ch[l] = 0;
            DFS(l + 1);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        P0706 p0706 = new P0706();
        ch = new int[n + 1];

        p0706.DFS(1);
    }
}
