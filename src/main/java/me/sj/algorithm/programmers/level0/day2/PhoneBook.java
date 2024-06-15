package me.sj.algorithm.programmers.level0.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public boolean sorting(String[] phone_book) {
        // phone_book 정렬
        Arrays.sort(phone_book);

        // 반복문을 돌면서 앞 번호가 뒷 번호의 접두어인지 확인한다
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        // 여기까지 오지 못했다면 접두어가 없다는 것이다
        return true;
    }

    public boolean hashMap(String[] phone_book) {
        // HashMap을 만든다
        Map<String, Integer> map = new HashMap<>();

        for (String s : phone_book) {
            map.put(s, 1);
        }

        // 모든 전화번호의 접두어가 HashMap에 있는지 확인한다
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }

            }
        }

        // 여기까지 왔다면 접두어가 없다는 것이다
        return true;
    }

}
