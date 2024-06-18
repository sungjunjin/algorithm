package me.sj.algorithm.inflearn.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문자열 압축
 */
public class P0111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();

        P0111 p0111 = new P0111();

        String answer = p0111.solutionLecture(inputStr);

        System.out.println(answer);

    }

    public String solutionMine(String str) {
        String answer = "";

        // 입력 문자열보다 한 사이즈 더 큰 배열을 선언
        char[] charArr = Arrays.copyOf(str.toCharArray(), str.length() + 1);

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if(charArr[i] == charArr[i + 1]) {
                count += 1;
            } else {
                answer += "" + charArr[i];

                if(count != 1 ) {
                    answer += count;
                }
                count = 1;
            }
        }

        return answer;
    }

    public String solutionLecture(String str) {
        String answer = "";

        // 마지막에 빈 문자 추가
        str = str + " ";
        int cnt = 1;

        for(int i=0;i<str.length()-1;i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);

                if(cnt > 1) {
                    answer += cnt;
                    cnt = 1;
                }
            }
        }

        return answer;
    }
}
