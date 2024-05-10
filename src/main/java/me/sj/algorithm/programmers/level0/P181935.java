package me.sj.algorithm.programmers.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */
public class P181935 {
    public int solution(int n) {
        int answer = 0;

        boolean isEven = n % 2 == 0;

        if (isEven) {
            // 짝수 부터 시작
            int num = 2;

            while (num <= n) {
                answer += num * num;
                num += 2;
            }
        } else {
            // 홀수 부터 시작
            int num = 1;

            while (num <= n) {
                answer += num;
                num += 2;
            }
        }

        return answer;
    }
}
