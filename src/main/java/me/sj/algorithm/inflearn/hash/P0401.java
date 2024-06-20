package me.sj.algorithm.inflearn.hash;

import java.util.*;

/**
 * 학급 회장 (해쉬)
 */
public class P0401 {
    public static void main(String[] args) {
        P0401 p0401 = new P0401();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String str = in.nextLine();

        System.out.println(p0401.solutionMine(n, str));
    }

    public char solutionMine(int n, String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        List<Map.Entry<Character, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        return entryList.get(map.size() - 1).getKey();
    }

    public char solutionLecture(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

}
