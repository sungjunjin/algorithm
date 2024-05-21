package me.sj.algorithm.programmers.level0;

import java.util.HashMap;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181926
 */
public class P181926 {
    public int solution(int n, String control) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        hashMap.put('w', 1);
        hashMap.put('s', -1);
        hashMap.put('d', 10);
        hashMap.put('a', -10);

        char[] controlArr = control.toCharArray();

        for(char c: controlArr) {
            n += hashMap.get(c);
        }

        return n;
    }
}
