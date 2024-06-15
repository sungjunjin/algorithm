package me.sj.algorithm.inflearn;

import java.util.Scanner;

/**
 * 문자 찾기
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

        for(Character c : str.toCharArray()) {
            if(Character.isUpperCase(c)) {
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

        for(char c : str.toCharArray()) {
            if(c >= 65 && c <= 90) {
                answer += (char)(c + 32);
            } else {
                answer += (char)(c - 32);
            }
        }

        return answer;
    }
}
