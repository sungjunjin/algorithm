package me.sj.algorithm.programmers.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181929
 */
public class P181929 {
    public int solution(int[] num_list) {
        int multiplySum = 1;
        int sum = 0;

        for (int num : num_list) {
            multiplySum = multiplySum * num;
            sum += num;
        }

        return multiplySum < sum * sum ? 1 : 0;
    }
}
