package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 숫자만 추출
 */
public class P0109 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();

        P0109 p0109 = new P0109();

        int answer = p0109.solutionMine(inputStr);

        System.out.println(answer);
    }

    public int solutionMine(String str) {
        StringBuilder sb = new StringBuilder();

        char[] charArr = str.toCharArray();

        for(char c : charArr) {
            if(Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public int solutionLecture(String str) {
        int answer = 0;
        for(char x : str.toCharArray()) {
            // ascii 0 ~ 9
            if(x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }
}
