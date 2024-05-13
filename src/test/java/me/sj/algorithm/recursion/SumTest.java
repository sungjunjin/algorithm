package me.sj.algorithm.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumTest {

    Sum sum = new Sum();

    @Test
    public void test() {
        int result = sum.sum(10);

        assertThat(result).isEqualTo(55);
    }

}