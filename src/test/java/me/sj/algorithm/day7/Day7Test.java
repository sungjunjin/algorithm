package me.sj.algorithm.day7;

import me.sj.algorithm.day6.Day6;
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
