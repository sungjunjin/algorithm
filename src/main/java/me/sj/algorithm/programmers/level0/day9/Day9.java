package me.sj.algorithm.programmers.level0.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day9 {
    public int[] sliceArray(int[] numbers, int num1, int num2) {
        // 배열의 길이를 구한다
        int length = num2 - num1;
        int[] answer = new int[length + 1];

        // num에서 num2만큼 인덱스로 접근해 새로운 배열에 담는다
        int i = 0;
        for (int j = num1; j <= num2; j++) {
            answer[i] = numbers[j];
            i++;
        }

        // Arrays 메소드 사용 가능
//        return Arrays.copyOfRange(numbers, num1, num2+1);

        return answer;
    }

    public String alphabetAge(int age) {
        // age를 문자열로 만든다
        String strAge = "" + age;
        // char 배열로 쪼갠다
        char[] charStrAge = strAge.toCharArray();

        StringBuilder sb = new StringBuilder();

        // 각각 char에 숫자 아스키 코드를 빼고 소문자 알파벳 아스키 코드를 더한다
        for (char c : charStrAge) {
            // 아스키 코드로 a = 97, 숫자 0부터는 48
            int asciiValue = (int) c - 48 + 97;
            sb.append((char) asciiValue);
        }

        return sb.toString();
    }

    public int[] emergency(int[] emergency) {
        int[] answer = new int[emergency.length];

        // emergency 배열을 List로 만든다
        List<Integer> intList = new ArrayList<>();

        for (int e : emergency) {
            intList.add(e);
        }

        // 내림차순으로 정렬한다
        intList.sort(Collections.reverseOrder());

        // emergency에서 한개씩 꺼내 인덱스를 가져온다
        int i = 0;
        for (int e : emergency) {
            answer[i] = intList.indexOf(e) + 1;
            i++;
        }

        return answer;
    }

    public int pair(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }

        return answer;
    }

}
