package me.sj.algorithm.inflearn.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 격자판 최대합
 */
public class P0109 {
    public static void main(String[] args) {
        P0109 p0109 = new P0109();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] answer = p0109.solutionLecture(arr);

        for(int a : answer) {
            System.out.print(a + " ");
        }

    }

    public int[] solutionMine(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        Map<Integer, Integer> scoreMap = new HashMap<>();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            scoreMap.put(arr[i], arr.length - i);
        }


        for(int i = 0; i < arr.length; i++) {
            answer[i] = scoreMap.get(answer[i]);
        }

        return answer;
    }

    public int[] solutionLecture(int[] arr) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            int count = 1;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    count++;
                }
            }

            answer[i] = count;
        }

        return answer;
    }
}
