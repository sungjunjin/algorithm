package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181934Test {
    P181934 solution = new P181934();

    @Test
    public void test() {
        String ineq = "<";
        String eq = "=";
        int n = 20;
        int m = 50;

        int result = solution.solution(ineq, eq, n, m);

        assertThat(result).isEqualTo(1);
    }

}