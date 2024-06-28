package me.sj.algorithm.inflearn.array;

import java.util.Scanner;

/**
 * 피보나치 수열
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * <p>
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 */
public class P0204 {
    public static void main(String[] args) {
        P0204 p0103 = new P0204();
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
