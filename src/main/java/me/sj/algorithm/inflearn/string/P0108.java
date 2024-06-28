package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 펠린드롬
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * <p>
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * <p>
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * <p>
 * 알파벳 이외의 문자들의 무시합니다.
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
                if (charArr[left] != charArr[right]) {
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

        if (str.equals(sb.reverse().toString())) {
            return "YES";
        }

        return "NO";
    }
}
