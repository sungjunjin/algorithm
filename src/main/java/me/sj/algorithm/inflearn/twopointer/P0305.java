package me.sj.algorithm.inflearn.twopointer;

import java.util.Scanner;

/**
 * 연속된 자연수의 합
 * <p>
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 N=15이면
 * <p>
 * 7+8=15
 * <p>
 * 4+5+6=15
 * <p>
 * 1+2+3+4+5=15
 * <p>
 * 와 같이 총 3가지의 경우가 존재한다.
 */
public class P0305 {
    public static void main(String[] args) {
        P0305 p0305 = new P0305();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(p0305.solutionLecture(n));
    }

    public int solutionMine(int num) {
        int answer = 0;

        // 자연수 배열 생성
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];

            if (sum == num) {
                answer++;
            }

            // 총합이 정수보다 클 때
            while (sum >= num) {
                // lt를 한개씩 올리면서, 전 arr[lt]값은 빼줌
                sum -= arr[lt++];

                // 합을 찾는다
                if (sum == num) {
                    answer++;
                }
            }
        }

        // 자기 자신은 빼기
        return answer - 1;
    }

    public int solutionLecture(int target) {
        int answer = 0, sum = 0, lt = 0;

        int m = target / 2 + 1;
        int[] arr = new int[m];

        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;

        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];

            if (sum == target) answer++;

            while (sum >= target) {
                sum -= arr[lt];
                lt++;

                if (sum == target) answer++;
            }
        }


        return answer;
    }

}
