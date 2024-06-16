package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 회문 문자열
 */
public class P0107 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();

        P0107 p0107 = new P0107();

        String answer = p0107.solutionLecture2(inputStr);

        System.out.println(answer);
    }

    public String solutionMine(String str) {
        str = str.toUpperCase();

        int left = 0;
        int right = str.length() - 1;

        char[] charArr = str.toCharArray();

        while(left < right) {
            if(charArr[left] != charArr[right]) {
                return "NO";
            }

            left++;
            right--;
        }

        return "YES";
    }

    public String solutionLecture(String str) {
        str = str.toUpperCase();
        int len = str.length();

        for(int i=0;i<len / 2;i++) {
            if(str.charAt(i) != str.charAt(len - i -1)) {
                return "NO";
            }
        }

        return "YES";
    }

    public String solutionLecture2(String str) {
        StringBuilder sb = new StringBuilder(str);

        if(str.equalsIgnoreCase(sb.reverse().toString())) {
            return "YES";
        }

        return "NO";
    }
}
