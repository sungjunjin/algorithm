package me.sj.algorithm.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * <p>
 * 첫 자리부터의 연속된 0은 무시한다.
 */
public class P0206 {
    public static void main(String[] args) {
        P0206 p0206 = new P0206();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> answer = p0206.solutionMine(arr);

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

        for (int i = 0; i < arr.length; i++) {

            // 숫자 뒤집기
            int tmp = arr[i];
            int res = 0;

            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public boolean isPrime(int num) {
        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
