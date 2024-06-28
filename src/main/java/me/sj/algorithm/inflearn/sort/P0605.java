package me.sj.algorithm.inflearn.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 중복 확인
 * 현수네 반에는 N명의 학생들이 있습니다.
 * <p>
 * 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
 * <p>
 * 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
 * <p>
 * N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
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
            if (arr[i - 1] == arr[i]) return "D";
        }

        return answer;
    }
}
