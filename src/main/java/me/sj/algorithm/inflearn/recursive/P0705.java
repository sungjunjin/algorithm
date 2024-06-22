package me.sj.algorithm.inflearn.recursive;

import java.util.Scanner;

/**
 * 이진 트리 순회
 */
public class P0705 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        P0705 p0704 = new P0705();

        System.out.println(p0704.solutionMine(n));
    }

    public int solutionMine(int n) {
        return binarySearch(n);
    }

    public int binarySearch(int n) {
        if(n == 1) {
            return n;
        }


        return n * binarySearch(n - 1);
    }
}
