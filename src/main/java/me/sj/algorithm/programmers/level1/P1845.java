package me.sj.algorithm.programmers.level1;

import java.util.HashSet;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
public class P1845 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int n: nums) {
            set.add(n);
        }

        return Math.min((nums.length / 2), set.size());
    }
}
