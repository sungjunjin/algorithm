package me.sj.algorithm.programmers.level0.day7;

import me.sj.algorithm.programmers.level0.day7.Day7;
import org.junit.jupiter.api.Test;

public class Day7Test {
    Day7 day = new Day7();

    @Test
    public void reverseStringTest() {
        String str = "jaron";

        day.reverseString(str);
    }

    @Test
    public void printTriangleTest() {
        day.printTriangle(3);
    }

}
