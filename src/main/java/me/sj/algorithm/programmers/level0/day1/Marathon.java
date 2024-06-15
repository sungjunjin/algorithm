package me.sj.algorithm.programmers.level0.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 완주하지 못한 선수
 */
public class Marathon {
    public String sortingLoop(String[] participant, String[] completion) {
        // 1. 두 배열을 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열을 다른 때까지 찾는다
        int i = 0;
        for(;i<completion.length;i++) {
            if(!completion[i].equals(participant[i])) {
                break;
            }
        }

        // 3. 여기까지 왔다면, 마지막 주자가 완주하지 못한 선수다
        return participant[i];
    }

    public String hashMapKeySet(String[] participant, String[] completion) {
        String answer = "";

        // 1. participant 기반의 HashMap을 만든다
        Map<String, Integer> map = new HashMap<>();

        for(String player: participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);

        }
        // 2.completion 배열을 돌면서 HashMap의 카운트를 뺀다
        for(String c: completion) {
            map.put(c, map.get(c) - 1);
        }

        // 3.HashMap의 key를 돌면서 value가 0이 아닌 선수를 찾는다
        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }

    public String hashMapEntrySet(String[] participant, String[] completion) {
        String answer = "";

        // 1. participant 기반의 HashMap을 만든다
        Map<String, Integer> map = new HashMap<>();

        for(String player: participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);

        }
        // 2.completion 배열을 돌면서 HashMap의 카운트를 뺀다
        for(String c: completion) {
            map.put(c, map.get(c) - 1);
        }

        // 3.EntrySet의 iterator로 반복문을 돌며 value가 0이 아닌 key를 찾는다
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            if(entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}
