package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181923Test {
    P181923 solution = new P181923();

    @Test
    public void test() {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2},{0, 2, 2}};

        int[] result = solution.solution(arr, queries);

        assertThat(result).isEqualTo(new int[]{3, 4, -1});
    }

    @Test
    public void test1() {
        int[] arr = {7, 8, 9};
        int[][] queries = {{0, 2, 10}, {0, 2, 3}};

        int[] result = solution.solution(arr, queries);

        assertThat(result).isEqualTo(new int[]{-1, 7});
    }
}