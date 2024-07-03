package me.sj.algorithm.udemy.dp;

public class FibonacciMemo {
    public int fibonacci(int num, int[] cache) {
        if (num <= 1) {
            return num;
        }

        if(cache[num] != 0) {
            return cache[num];
        }

        int result = fibonacci(num - 2, cache) + fibonacci(num - 1, cache);
        cache[num] = result;

        return result;
    }
}
