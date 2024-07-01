package me.sj.algorithm.programmers.test;

public class Test5 {
    public static void main(String[] args) {
        Test5 test1 = new Test5();
        int[] arr = {6, 10, 3, 9, 4, 10, 3, 9, 3, 10, 6};

        System.out.println(test1.solution2(arr));
    }

    public int solution(int[] happiness) {
        int answer = 0;
        int left = 0;
        int happyCnt = 0;
        int sadcnt = 0;

        for (int right = 0; right < happiness.length; right++) {
            if (happiness[right] > 8) {
                happyCnt++;
            } else {
                sadcnt++;
            }
            // 행복하지 않은 날이 더 많으면 윈도우의 시작 지점을 앞으로 이동
            while (sadcnt > happyCnt && left <= right) {
                if (happiness[left] > 8) {
                    happyCnt--;
                } else {
                    sadcnt--;
                }
                left++;
            }
            // 현재 윈도우가 유효하면 최대 길이를 업데이트
            if (happyCnt > sadcnt) {
                answer = Math.max(answer, right - left + 1);
            }
        }

        return answer;
    }

    public static int solution2(int[] happiness) {
        int left = 0, right = 0, maxHappyDays = 0, happyDays = 0;

        while (right < happiness.length) {
            if (happiness[right] >= 8) {
                happyDays++;
            }

            if (happyDays > (right - left) / 2) {
                maxHappyDays = right - left + 1;
            }

            if (happyDays * 2 <= right - left + 1) {
                happyDays -= happiness[left] >= 8 ? 1 : 0;
                left++;
            }

            right++;
        }

        return maxHappyDays;
    }
}
