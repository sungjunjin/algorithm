package me.sj.algorithm.inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 중복 문자 제거
 */
public class P0106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();

        P0106 p0106 = new P0106();

        String answer = p0106.solutionLecture(inputStr);

        System.out.println(answer);
    }

    public String solutionMine(String str) {
        ArrayList<Character> arrayList = new ArrayList<>();
        char[] charArr = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : charArr) {
            if (!arrayList.contains(c)) {
                arrayList.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public String solutionLecture(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            // 처음 발견된 인덱스와 일치하지 않으면 중복이 있다는 뜻
            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
