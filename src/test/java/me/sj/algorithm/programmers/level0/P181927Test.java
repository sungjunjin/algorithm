package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181927Test {
    P181927 solution = new P181927();

    @Test
    public void test1() {
        int[] num_list = {2, 1, 6};

        int[] result = solution.solution(num_list);

        assertThat(result).isEqualTo(new int[]{2, 1, 6, 5});
    }

}