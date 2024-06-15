package me.sj.algorithm.inflearn;

import java.util.Scanner;

/**
 * 문자 찾기
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
