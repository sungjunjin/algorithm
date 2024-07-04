package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 동전 교환
 * 다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
 * <p>
 * 각 단위의 동전은 무한정 쓸 수 있다.
 */
public class P0805 {
    static int n, m;
    static int[] coins;
    // 동전 개수
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        P0805 p0805 = new P0805();
        Scanner in = new Scanner(System.in);

        // 동전의 종류 개수
        n = in.nextInt();
        coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = in.nextInt();
        }

        // 거슬러 줄 금액
        m = in.nextInt();

        p0805.dfs(0, 0);

        System.out.println(answer);
    }

    public void dfs(int coinCount, int sum) {
        // 거슬러줄 금액 이상은 볼 필요가 없음
        if (sum > m) {
            return;
        }

        // 현재까지 구해진 최소 동전 개수보다 많아지면 볼 필요가 없음
        if(answer < coinCount) {
            return;
        }

        if (sum == m) {
            answer = Math.min(coinCount, answer);
        } else {
            for (int i = 0; i < coins.length; i++) {
                // 큰 동전 단위부터 역순으로 진행
                dfs(coinCount + 1, sum + coins[(coins.length - 1) - i]);
            }
        }
    }
}