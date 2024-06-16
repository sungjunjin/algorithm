package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 */
public class P0105 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();

        P0105 p0105 = new P0105();

        String answer = p0105.solutionMine(inputStr);

        System.out.println(answer);
    }

    public String solutionMine(String str) {
        char[] charArr = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            boolean isLeftAlpha = Character.isAlphabetic(charArr[left]);
            boolean isRightAlpha = Character.isAlphabetic(charArr[right]);

            if(!isLeftAlpha) {
                left++;

                continue;
            }

            if(!isRightAlpha) {
                right--;
                continue;
            }


            if (isLeftAlpha && isRightAlpha) {
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
            }

            left++;
            right--;
        }

        return String.valueOf(charArr);
    }

    public String solutionLecture(String str) {
        String answer = "";

        return answer;
    }
}
