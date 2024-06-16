package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 펠린드롬
 */
public class P0108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();

        P0108 p0108 = new P0108();

        String answer = p0108.solutionLecture(inputStr);

        System.out.println(answer);
    }

    public String solutionMine(String str) {
        str = str.toUpperCase();

        char[] charArr = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            boolean isLeftAlpha = Character.isAlphabetic(charArr[left]);
            boolean isRightAlpha = Character.isAlphabetic(charArr[right]);

            if(!isLeftAlpha) {
                left++;
                continue;
            }

            if (!isRightAlpha) {
                right--;
                continue;
            }

            if(isLeftAlpha && isRightAlpha) {
                if(charArr[left] != charArr[right]) {
                    return "NO";
                }
            }

            left++;
            right--;
        }

        return "YES";
    }

    public String solutionLecture(String str) {
        // 정규식에서 ^는 부정
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        StringBuilder sb = new StringBuilder(str);

        if(str.equals(sb.reverse().toString())) {
            return "YES";
        }

        return "NO";
    }
}
