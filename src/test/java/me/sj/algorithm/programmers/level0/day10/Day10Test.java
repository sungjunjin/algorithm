package me.sj.algorithm.programmers.level0.day10;

import me.sj.algorithm.programmers.level0.day10.Day10;
import org.junit.jupiter.api.Test;

public class Day10Test {
    Day10 day10 = new Day10();

    @Test
    public void antTest() {
        int hp = 23;
        int result = day10.ant(hp);
        System.out.println(result);
    }

    @Test
    public void rspTest() {
        String rsp = "2";
        String result = day10.rsp(rsp);
        System.out.println(result);
    }


}
