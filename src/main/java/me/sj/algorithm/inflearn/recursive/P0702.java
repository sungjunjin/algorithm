package me.sj.algorithm.inflearn.recursive;

import java.util.Scanner;

/**
 * 이진수 출력
 */
public class P0702 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        P0702 p0702 = new P0702();

        p0702.solutionMine(n);
    }

    public int solutionMine(int n) {
        printBinaryRecursive(n);
        return 0;
    }

    public void printBinaryRecursive(int n) {
        if(n <= 1) {
            System.out.print(n + " ");
            return;
        }

        printBinaryRecursive(n / 2);
        System.out.print(n % 2 + " ");

    }
}
