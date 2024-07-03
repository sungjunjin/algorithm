package me.sj.algorithm.data;

import me.sj.algorithm.udemy.data.Queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue<String> queue = new Queue<>();

    @Test
    public void initTest() {
        assertEquals(queue.getData().length, 10);
    }

    @Test
    public void add() {
        String element = "element";

        queue.add(element);

        assertEquals(queue.getFront(), 0);
        assertEquals(queue.getBack(), 1);
    }

    @Test
    public void addThreeTimes() {
        // given
        String element1 = "element1";
        String element2 = "element2";
        String element3 = "element3";

        queue.add(element1);
        queue.add(element2);
        queue.add(element3);

        assertEquals(queue.getFront(), 0);
        assertEquals(queue.getBack(), 3);
    }

    @Test
    public void addThreeTimesAndGet() {
        // given
        String element1 = "element1";
        String element2 = "element2";
        String element3 = "element3";

        queue.add(element1);
        queue.add(element2);
        queue.add(element3);


        assertEquals(queue.poll(), element1);
    }

}