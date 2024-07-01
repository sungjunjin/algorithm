package me.sj.algorithm.programmers.test.practice;

/**
 * [본 문제는 정확성과 효율성 테스트 각각 점수가 있는 문제입니다.]
 * 징검다리 건너기
 * 카카오 초등학교의 "니니즈 친구들"이 "라이언" 선생님과 함께 가을 소풍을 가는 중에 징검다리가 있는 개울을 만나서 건너편으로 건너려고 합니다. "라이언" 선생님은 "니니즈 친구들"이 무사히 징검다리를 건널 수 있도록 다음과 같이 규칙을 만들었습니다.
 */
public class Practice1 {
    public static void main(String[] args) {
        Practice1 test1 = new Practice1();
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        int k = 3;

        int ans = test1.solution(stones, k);
        System.out.println(ans);
    }

    public int solution(int[] stones, int k) {
        int answer = 0;

        int min = 0;
        int max = Integer.MAX_VALUE;


        while (min <= max) {
            int mid = (min + max) / 2;

            if (canCross(mid, stones, k)) {
                answer = Math.max(answer, mid);
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return answer;
    }

    public static boolean canCross(int peopleCnt, int[] stones, int k) {
        int zeroStoneCnt = 0;

        for (int stone : stones) {
            if (stone - peopleCnt < 0) {
                zeroStoneCnt++;
            } else {
                zeroStoneCnt = 0;
            }

            if (k <= zeroStoneCnt) {
                return false;
            }
        }

        return true;
    }
}
