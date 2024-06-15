package me.sj.algorithm.dp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciMemoTest {
    FibonacciMemo fibonacci = new FibonacciMemo();

    @Test
    public void test() {
        int cache[] = new int[10];
        int result = fibonacci.fibonacci(5, cache);

        assertThat(result).isEqualTo(8);
    }
}