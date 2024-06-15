package me.sj.algorithm.programmers.level0.day9;

import me.sj.algorithm.programmers.level0.day9.Day9;
import org.junit.jupiter.api.Test;

public class Day9Test {
    Day9 day9 = new Day9();

    @Test
    public void sliceArrayTest() {
        int[] numbers = {1,3,5};
        int num1 = 1;
        int num2 = 2;

        int[] result = day9.sliceArray(numbers, num1, num2);


        for(int i: result) {
            System.out.println(i);
        }
    }

    @Test
    public void alphabetAgeTest() {
        String s = day9.alphabetAge(23);
        System.out.println(s);
    }

    @Test
    public void emergencyTest() {
        int[] emergency = {3,76,24};
        int[] result = day9.emergency(emergency);
        for(int i: result) {
            System.out.println(i);
        }
    }

    @Test
    public void pairTest(){
        int result = day9.pair(20);
        System.out.println(result);
    }
}
