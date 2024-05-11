package me.sj.algorithm.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void test() {
        int result = fibonacci.fibonacci(5);

        assertThat(result).isEqualTo(8);
    }

}