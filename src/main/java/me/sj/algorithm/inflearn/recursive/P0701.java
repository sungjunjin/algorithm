package me.sj.algorithm.inflearn.recursive;

import java.util.Scanner;

/**
 * 재귀함수
 */
public class P0701 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        P0701 p0701 = new P0701();

        p0701.solutionMine(n);
    }

    public int solutionMine(int n) {
        printNumRecursive(n);
        return 0;
    }

    public void printNumRecursive(int n) {
        if(n == 0) {
        } else {
            printNumRecursive(n - 1);
            System.out.println(n);
        }
    }
}
