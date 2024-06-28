package me.sj.algorithm.inflearn.array;

import java.util.Scanner;

/**
 * 소수(에라토스테네스 체)
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 */
public class P0205 {
    public static void main(String[] args) {
        P0205 p0205 = new P0205();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(p0205.solutionMine(n));

    }

    public int solutionMine(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
            }

            // i의 배수만큼 소수가 아님을 표시
            for (int j = i; j <= n; j = j + i) {
                ch[j] = 1;
            }
        }

        return answer;
    }

    public int solutionLecture(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                // 배수를 돌면서 소수가 아님을 체크 해준다.
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }
}
