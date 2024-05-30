package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181924Test {
    P181924 solution = new P181924();

    @Test
    public void test() {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};

        int[] result = solution.solution(arr, queries);

        assertThat(result).isEqualTo(new int[]{3, 4, 1, 0, 2});
    }
}