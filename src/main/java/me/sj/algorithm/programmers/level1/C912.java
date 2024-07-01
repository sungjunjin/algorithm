package me.sj.algorithm.programmers.level1;

/**
 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */
public class C912 {
    public static void main(String[] args) {
        C912 p1003 = new C912();
        long n = 12345;

        int[] answer = p1003.solution(n);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));

        String reversedStr = sb.reverse().toString();
        int[] answer = new int[reversedStr.length()];

        for (int i = 0; i < reversedStr.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(reversedStr.charAt(i)));
        }

        return answer;
    }
}
