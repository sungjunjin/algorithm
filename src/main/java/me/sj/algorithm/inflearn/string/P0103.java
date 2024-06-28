package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 문장 속 단어
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * <p>
 * 문장속의 각 단어는 공백으로 구분됩니다.
 */
public class P0103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        P0103 p0103 = new P0103();

        System.out.println(p0103.solutionLecture(input1));
    }

    public String solutionMine(String str) {
        String[] strArray = str.split(" ");

        int max = 0;
        for (String s : strArray) {
            if (max < s.length()) {
                max = s.length();
            }
        }

        for (String s : strArray) {
            if (s.length() == max) {
                return s;
            }
        }

        return null;
    }

    public String solutionLecture(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for (String x : s) {
            int len = x.length();

            if (len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }
}
