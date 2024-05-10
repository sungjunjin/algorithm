package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181931Test {
    P181931 solution = new P181931();

    @Test
    public void test1() {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};

        int result = solution.solution(a,d,included);

        assertThat(result).isEqualTo(37);
    }

}