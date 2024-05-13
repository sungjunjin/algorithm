package me.sj.algorithm.recursion;

public class Sum {
    public int sum(int n) {
        if (n <= 1) {
            return n;
        }

        return n + sum(n - 1);
    }
}
