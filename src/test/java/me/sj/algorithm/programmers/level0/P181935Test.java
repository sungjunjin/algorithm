package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181935Test {
    P181935 solution = new P181935();

    @Test
    public void test() {
        int n = 7;

        int result = solution.solution(n);

        assertThat(result).isEqualTo(16);
    }

}