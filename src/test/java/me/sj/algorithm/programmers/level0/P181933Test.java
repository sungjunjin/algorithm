package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181933Test {
    P181933 solution = new P181933();

    @Test
    public void test() {
        int a = -4;
        int b = 7;
        boolean flag = true;

        int result = solution.solution(a,b,flag);

        assertThat(result).isEqualTo(3);
    }

}