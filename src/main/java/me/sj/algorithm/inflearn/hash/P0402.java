package me.sj.algorithm.inflearn.hash;

import java.util.*;

/**
 * 아나그램 (해쉬)
 */
public class P0402 {
    public static void main(String[] args) {
        P0402 p0402 = new P0402();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = in.nextLine();

        System.out.println(p0402.solutionLecture(str, str2));
    }

    public String solutionMine(String str, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for(Character c : map.keySet()) {
            if(!map.get(c).equals(map2.get(c))) {
                return "NO";
            }
        }

        return "YES";
    }

    public String solutionLecture(String str, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : str2.toCharArray()) {
            if(!map.containsKey(c)) {
                return "NO";
            }

            map.put(c, map.get(c) - 1);
        }

        for(int i : map.values()) {
            if(i != 0) {
                return "NO";
            }
        }

        return "YES";
    }
}
