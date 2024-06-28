package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 숫자만 추출
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * <p>
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * <p>
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
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

        for (char c : charArr) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public int solutionLecture(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            // ascii 0 ~ 9
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }
}
