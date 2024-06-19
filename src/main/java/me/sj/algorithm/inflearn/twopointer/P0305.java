package me.sj.algorithm.inflearn.twopointer;

import java.util.Scanner;

/**
 * 연속 부분수열
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
            sum+= arr[rt];

            if(sum == target) answer++;

            while(sum >= target) {
                sum -= arr[lt];
                lt++;

                if(sum == target) answer++;
            }
        }


        return answer;
    }

}
