package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 * 동전 교환
 * 다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
 * <p>
 * 각 단위의 동전은 무한정 쓸 수 있다.
 */
public class P0805 {
    static int amount = 0;
    static int n = 0;
    static int sum = 0;
    static int answer = 12;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0805 p0805 = new P0805();

        // 동전의 종류 개수 N
        n = in.nextInt();
        // 동전의 종류 배열
        Integer[] coinArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            int coin = in.nextInt();
            coinArr[i] = coin;
        }

        // 큰 금액부터 찾아보기 위해 내림차순 정렬
        Arrays.sort(coinArr, Collections.reverseOrder());

        // 거슬러 줄 금액
        amount = in.nextInt();

        p0805.dfs(0, sum, coinArr);
        System.out.println(answer);
    }

    public void dfs(int level, int sum, Integer[] coinArr) {
        if (level >= answer) return;
        if (sum > amount) return;

        if (sum == amount) {
            answer = Math.min(level, answer);
        } else {
            for (int c : coinArr) {
                dfs(level + 1, sum + c, coinArr);
            }
        }
    }
}