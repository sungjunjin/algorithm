package me.sj.algorithm.day4;

import java.util.*;

public class Day4 {
    public int centerValue(int[] array) {
        // 배열 정렬
        Arrays.sort(array);

        int index = array.length / 2;

        return array[index];
    }

    public int mode(int[] array) {
        // 해쉬로 만듬
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: array) {
            map.put(i, 0);
        }

        // key로 빈도수 카운트
        for(int i: array) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
        }

        // value의 최대값 리턴
        int maxValue = 0;
        int answer = 0;

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();

            if(next.getValue() > maxValue) {
                maxValue = next.getValue();
                answer = next.getKey();
            }
        }

        // 최빈값을 map에서 제거
        map.remove(answer);

        // 최빈값이 한개 더 있을 경우 -> 최빈값이 여러개일 경우 -1 리턴
        if(map.containsValue(maxValue)) {
            return -1;
        }

        return answer;
    }

    public int[] oddArray(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                arrayList.add(i);
            }
        }

        int[] answer = new int[arrayList.size()];

        int j = 0;
        for(Integer i: arrayList) {
            answer[j] = i;
            j++;
        }

        return answer;
    }

}
