package me.sj.algorithm.programmers.level1;

/**
 * 124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
 *
 * 124 나라에는 자연수만 존재합니다.
 * 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
 */
public class C849 {
    public static void main(String[] args) {
        C849 p1003 = new C849();
        int n = 6;

        String answer = p1003.solution(n);

        System.out.println(answer);
    }

    public String solution(int n) {
        String answer = "";

        String[] nums = {"4", "1", "2"};

        while(n > 0) {
            answer = nums[n % 3] + answer;
            n = (n - 1) / 3;
        }

        return answer;
    }
}
