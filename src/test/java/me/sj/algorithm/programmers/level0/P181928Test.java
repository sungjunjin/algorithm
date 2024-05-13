package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181928Test {
    P181928 solution = new P181928();

    @Test
    public void test1() {
        int[] num_list = {3, 4, 5, 2, 1};

        int result = solution.solution(num_list);

        assertThat(result).isEqualTo(393);
    }

}