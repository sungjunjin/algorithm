package me.sj.algorithm.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P1845Test {
    P1845 solution = new P1845();

    @Test
    public void test() {
        int[] nums = {3,3,3,2,2,4};

        int result = solution.solution(nums);

        assertThat(result).isEqualTo(3);
    }

}