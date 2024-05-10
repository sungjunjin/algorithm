package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181930Test {
    P181930 solution = new P181930();

    @Test
    public void test1() {
        int a = 2;
        int b = 6;
        int c = 1;

        int result = solution.solution(a,b,c);

        assertThat(result).isEqualTo(9);
    }

}