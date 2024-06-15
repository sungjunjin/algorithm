package me.sj.algorithm.programmers.level0.day5;

import me.sj.algorithm.programmers.level0.day5.Day5;
import org.junit.jupiter.api.Test;

public class Day5Test {
    @Test
    public void pizza1Test() {
        Day5 day5 = new Day5();
        day5.pizza1(7);
    }

    @Test
    public void pizza2Test() {
        Day5 day5 = new Day5();
        day5.pizza2(6);
    }

    @Test
    public void arrayAvgTest() {
        Day5 day5 = new Day5();
        int[] param = {1,2,3,4,5,6,7,8,9,10};
        double result = day5.arrayAvg(param);
        System.out.println(result);
    }
}
