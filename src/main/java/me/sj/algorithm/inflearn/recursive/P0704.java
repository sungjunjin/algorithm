package me.sj.algorithm.inflearn.recursive;

import java.util.Scanner;

/**
 * 팩토리얼 재귀
 */
public class P0704 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        P0704 p0704 = new P0704();

        System.out.println(p0704.solutionMine(n));
    }

    public int solutionMine(int n) {
        return factorial(n);
    }

    public int factorial(int n) {
        if(n == 1) {
            return n;
        }


        return n * factorial(n - 1);
    }
}
