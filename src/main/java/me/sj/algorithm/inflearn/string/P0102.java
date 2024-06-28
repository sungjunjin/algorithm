package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 대소문자 변환
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 */
public class P0102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        P0102 p0102 = new P0102();

        System.out.println(p0102.solutionLecture(input1));
    }

    public String solutionMine(String str) {
        StringBuilder sb = new StringBuilder();

        for (Character c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }

    /**
     * 아스키 코드 풀이
     */
    public String solutionLecture(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                answer += (char) (c + 32);
            } else {
                answer += (char) (c - 32);
            }
        }

        return answer;
    }
}
