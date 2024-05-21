package me.sj.algorithm.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P181926Test {

    P181926 solution = new P181926();

    @Test
    public void test() {
        String control = "wsdawsdassw";
        int n = 0;

        int result = solution.solution(n, control);

        assertThat(result).isEqualTo(-1);
    }

}