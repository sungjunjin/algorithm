package me.sj.algorithm.inflearn.array;

import java.util.Scanner;

/**
 * 피보나치 수열
 */
public class P0104 {
    public static void main(String[] args) {
        P0104 p0103 = new P0104();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        p0103.solutionLecture(n);

    }

    public String solutionMine(int count) {
        StringBuilder answer = new StringBuilder();

        int[] arr = new int[count];

        arr[0] = 1;
        answer.append(arr[0]).append(" ");
        arr[1] = 1;
        answer.append(arr[1]).append(" ");


        for (int i = 2; i < count; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            answer.append(arr[i]).append(" ");
        }

        return answer.toString();
    }

    public void solutionLecture(int n) {
        // 배열 없이 피보나치 사용하기
        int a = 1;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
