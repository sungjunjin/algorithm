package me.sj.algorithm.data;

import me.sj.algorithm.udemy.data.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {

    private Stack<String> stack = new Stack<>();

    @Test
    public void initTest() {
        assertEquals(stack.getData().length, 10);
    }

    @Test
    public void push() {
        // given
        String element = "element1";

        // when
        stack.push(element);

        // then
        assertEquals(stack.getTop(), 1);
    }

    @Test
    public void pushThreeTimes() {
        // given
        String element1 = "element1";
        String element2 = "element2";
        String element3 = "element3";

        // when
        stack.push(element1);
        stack.push(element2);
        stack.push(element3);

        // then
        assertEquals(stack.getTop(), 3);
    }

    @Test
    public void get() {
        // given
        String element = "element1";

        // when
        stack.push(element);

        // then
        assertEquals(stack.get(element), element);
    }

    @Test
    public void pushThreeTimesAndGet() {
        // given
        String element1 = "element1";
        String element2 = "element2";
        String element3 = "element3";

        // when
        stack.push(element1);
        stack.push(element2);
        stack.push(element3);

        // then
        assertEquals(stack.pop(), element3);
    }
}