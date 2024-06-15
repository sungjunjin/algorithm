package me.sj.algorithm.programmers.level0.day2;

import me.sj.algorithm.programmers.level0.day2.PhoneBook;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    String[] answerFalse = {"119", "97674223", "1195524421"};
    String[] answerTrue = {"123", "456", "789"};

    @Test
    public void sortedLoop() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.sorting(answerFalse);
    }

    @Test
    public void hashMap() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.hashMap(answerTrue);
    }
}
