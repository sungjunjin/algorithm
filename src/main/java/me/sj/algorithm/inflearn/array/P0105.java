package me.sj.algorithm.inflearn.array;

import java.util.Scanner;

/**
 * 소수(에라토스테네스 체)
 */
public class P0105 {
    public static void main(String[] args) {
        P0105 p0105 = new P0105();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(p0105.solutionMine(n));

    }

    public int solutionMine(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                answer++;
            }

            // i의 배수만큼 소수가 아님을 표시
            for(int j=i;j<=n;j=j+i) {
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
