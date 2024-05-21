package me.sj.algorithm.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P12906Test {

    P12906 solution = new P12906();

    @Test
    public void stackTest() {
        int[] arr = {1,1,3,3,0,1,1};

        int[] result = solution.stackSolution(arr);

        assertThat(result).isEqualTo(new int[]{1,3,0,1});
    }


    @Test
    public void queueTest() {
        int[] arr = {1,1,3,3,0,1,1};

        int[] result = solution.arraySolution(arr);

        assertThat(result).isEqualTo(new int[]{1,3,0,1});
    }

}