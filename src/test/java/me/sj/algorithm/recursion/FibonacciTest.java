package me.sj.algorithm.recursion;

import me.sj.algorithm.udemy.recursion.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void test() {
        int result = fibonacci.fibonacci(5);

        assertThat(result).isEqualTo(8);
    }
}