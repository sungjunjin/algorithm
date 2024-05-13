package me.sj.algorithm.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    Factorial factorial = new Factorial();

    @Test
    public void test() {
        int result = factorial.factorial(4);

        assertThat(result).isEqualTo(24);

    }

}