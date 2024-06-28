package me.sj.algorithm.inflearn.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 격자판 최대합
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * <p>
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 */
public class P0209 {
    public static void main(String[] args) {
        P0209 p0209 = new P0209();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] answer = p0209.solutionLecture(arr);

        for (int a : answer) {
            System.out.print(a + " ");
        }

    }

    public int[] solutionMine(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        Map<Integer, Integer> scoreMap = new HashMap<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            scoreMap.put(arr[i], arr.length - i);
        }


        for (int i = 0; i < arr.length; i++) {
            answer[i] = scoreMap.get(answer[i]);
        }

        return answer;
    }

    public int[] solutionLecture(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                }
            }

            answer[i] = count;
        }

        return answer;
    }
}
