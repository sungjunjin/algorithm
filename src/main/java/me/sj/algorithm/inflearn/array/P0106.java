package me.sj.algorithm.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 */
public class P0106 {
    public static void main(String[] args) {
        P0106 p0106 = new P0106();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> answer = p0106.solutionMine(arr);

        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }

    public ArrayList<Integer> solutionMine(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int n : arr) {
            // 뒤집기
            StringBuilder sb = new StringBuilder(String.valueOf(n));

            int reversedNum = Integer.parseInt(sb.reverse().toString());

            // 1이면 스킵
            if (reversedNum == 1) {
                continue;
            }

            // 소수 여부 구하기
            if (reversedNum == 2) {
                answer.add(reversedNum);
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i < reversedNum; i++) {
                if (reversedNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // 소수면 리스트에 더한다
            if (isPrime) {
                answer.add(reversedNum);
            }
        }

        return answer;
    }

    public ArrayList<Integer> solutionLecture(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        return answer;
    }
}
