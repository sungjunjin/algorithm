package me.sj.algorithm.programmers.level0.day8;

import me.sj.algorithm.programmers.level0.day8.Day8;
import org.junit.jupiter.api.Test;

public class Day8Test {
    Day8 day = new Day8();

    @Test
    public void removeCharTest() {
        String my_string = "BCBdbe";
        String letter = "B";

        String result = day.removeChar(my_string, letter);
        System.out.println(result);
    }

    @Test
    public void lambTest() {
        int n = 10;
        int k = 3;

        int result = day.lamb(n, 3);
        System.out.println(result);
    }
}
