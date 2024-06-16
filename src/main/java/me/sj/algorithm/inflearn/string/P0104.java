package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 단어 뒤집기
 */
public class P0104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());

        String[] inputStrArr = new String[count];

        for (int i = 0; i < count; i++) {
            inputStrArr[i] = in.nextLine();
        }

        P0104 p0104 = new P0104();

        String[] answer = p0104.solutionLecture2(inputStrArr);

        for (String a : answer) {
            System.out.println(a);
        }
    }

    public String[] solutionMine(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            StringBuilder sb = new StringBuilder();

            char[] charArr = strArr[i].toCharArray();

            for (int j = 0; j < strArr[i].length(); j++) {
                sb.append(charArr[strArr[i].length() - 1 - j]);
            }

            answer[i] = sb.toString();
        }

        return answer;
    }

    public String[] solutionLecture(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            // StringBuilder reverse 메소드 사용 가능
            String tmp = new StringBuilder(strArr[i]).reverse().toString();
            answer[i] = tmp;
        }

        return answer;
    }

    public String[] solutionLecture2(String[] strArr) {
        String[] answer = new String[strArr.length];

        for(int i = 0; i<strArr.length; i++) {
            char[] charArr = strArr[i].toCharArray();

            int left = 0;
            int right = strArr[i].length() - 1;
            while(left < right) {
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;

                left++;
                right--;
            }

            answer[i] = String.valueOf(charArr);
        }

        return answer;
    }
}
