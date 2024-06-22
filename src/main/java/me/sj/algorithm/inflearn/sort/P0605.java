package me.sj.algorithm.inflearn.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 중복 확인
 */
public class P0605 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0605 p0605 = new P0605();
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p0605.solutionLecture(arr));
    }

    public String solutionMine(int[] arr) {
        String answer = "D";

        HashSet<Integer> set = new HashSet<>();

        for (int a : arr) {
            set.add(a);
        }

        if (set.size() == arr.length) {
            return "U";
        }

        return answer;
    }

    public String solutionLecture(int[] arr) {
        String answer = "U";
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] == arr[i]) return "D";
        }

        return answer;
    }
}
