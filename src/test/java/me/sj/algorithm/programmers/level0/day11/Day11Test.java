package me.sj.algorithm.programmers.level0.day11;

import me.sj.algorithm.programmers.level0.day11.Day11;
import org.junit.jupiter.api.Test;

public class Day11Test {
    Day11 day11 = new Day11();

    @Test
    public void solution2Test() {
        int[] num_list = {1,2,3,4,5,6,7,8};
        int n = 2;
        int[][] result = day11.solution2(num_list, n);
    }

    @Test
    public void solution3Test() {
        int[] numbers = {1,2,3,4,5,6};
        int k = 5;

        int result = day11.solution3(numbers, k);
        System.out.println(result);
    }

    @Test
    public void solution4Test() {
        int[] numbers = {1,2,3};
        String direction = "left";

        int[] result = day11.solution4(numbers, direction);

        for(int r: result) {
            System.out.println(r);
        }
    }

}
