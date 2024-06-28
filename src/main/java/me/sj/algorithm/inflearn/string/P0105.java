package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * <p>
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
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

            if (!isLeftAlpha) {
                left++;

                continue;
            }

            if (!isRightAlpha) {
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
