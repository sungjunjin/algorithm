package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181925Test {

    P181925 solution = new P181925();

    @Test
    public void test() {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        String result = solution.solution(numLog);

        assertThat(result).isEqualTo("wsdawsdassw");
    }

}