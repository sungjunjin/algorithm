package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181932Test {
    P181932 solution = new P181932();

    @Test
    public void test1() {
        String code = "abc1abc1abc";

        String result = solution.solution(code);

        assertThat(result).isEqualTo("acbac");
    }

    @Test
    public void test2() {
        String code = "";

        String result = solution.solution(code);

        assertThat(result).isEqualTo("EMPTY");
    }

}