package me.sj.algorithm.inflearn;

import java.util.Scanner;

/**
 * 문자 찾기
 */
public class P0103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        P0103 p0103 = new P0103();

        System.out.println(p0103.solutionMine(input1));
    }

    public String solutionMine(String str) {
        String[] strArray = str.split(" ");

        int max = 0;
        for(String s : strArray) {
            if(max < s.length()) {
                max = s.length();
            }
        }

        for(String s : strArray) {
            if(s.length() == max) {
                return s;
            }
        }

        return null;
    }

    public String solutionLecture(String str) {
        String answer = "";

        return answer;
    }
}
