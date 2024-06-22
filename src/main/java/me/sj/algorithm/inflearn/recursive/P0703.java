package me.sj.algorithm.inflearn.recursive;

import java.util.Scanner;

/**
 * 팩토리얼 재귀
 */
public class P0703 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        P0703 p0703 = new P0703();

        p0703.solutionMine(n);
    }

    public void solutionMine(int n) {
        System.out.println(fiboMemoization(n));
    }

    /**
     * 재귀를 사용한 피보나치
     */
    public int fibo(int n) {
        if (n <= 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    /**
     * 메모이제이션 (배열)을 사용한 피보나치
     */
    public int fiboMemoization(int n) {
        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr[n - 1];
    }
}
