package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 암호
 */
public class P0112 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int charLength = Integer.parseInt(in.nextLine());
        String inputStr = in.nextLine();

        P0112 p0112 = new P0112();
        String answer = p0112.solutionMine(charLength, inputStr);

        System.out.println(answer);

    }

    public String solutionMine(int charLength, String str) {
        String answer = "";

        for (int i = 0; i < charLength; i++) {
            String temp = str.substring(0, 7);
            temp = temp.replace("#", "1")
                    .replace("*", "0");

            int num = Integer.parseInt(temp , 2);
            answer += (char) num;

            str = str.substring(7);
        }

        return answer;
    }

    public String solutionLecture(int charLength, String str) {
        String answer = "";

        for (int i = 0; i < charLength; i++) {
            String tmp = str.substring(0, 7)
                    .replace("*", "0")
                    .replace("#", "1");

            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;

            str = str.substring(7);
        }

        return answer;
    }
}
