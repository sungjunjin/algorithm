package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 문자 찾기
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * <p>
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 */
public class P0101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);

        P0101 p0101 = new P0101();

        System.out.println(p0101.solutionLecture(input1, input2));
    }

    public int solutionMine(String str, char c) {
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        int count = 0;

        for (char character : str.toCharArray()) {
            if (character == c) {
                count++;
            }
        }

        return count;
    }

    public int solutionLecture(String str, char c) {
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }
}
