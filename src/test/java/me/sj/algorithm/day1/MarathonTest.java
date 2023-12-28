package me.sj.algorithm.day1;

import org.junit.jupiter.api.Test;

public class MarathonTest {

    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};

    @Test
    public void sortedLoop() {
        Marathon marathon = new Marathon();
        marathon.sortingLoop(participant, completion);
    }

    @Test
    public void hashMapKeySet() {
        Marathon marathon = new Marathon();
        marathon.hashMapKeySet(participant, completion);
    }

    @Test
    public void hashMapEntrySet() {
        Marathon marathon = new Marathon();
        marathon.hashMapEntrySet(participant, completion);
    }


}
