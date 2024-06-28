package me.sj.algorithm.inflearn.hash;

import java.util.*;

/**
 * 아나그램 (해쉬)
 * Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
 * <p>
 * 예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
 * <p>
 * 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
 * <p>
 * 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
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

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Character c : map.keySet()) {
            if (!map.get(c).equals(map2.get(c))) {
                return "NO";
            }
        }

        return "YES";
    }

    public String solutionLecture(String str, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c)) {
                return "NO";
            }

            map.put(c, map.get(c) - 1);
        }

        for (int i : map.values()) {
            if (i != 0) {
                return "NO";
            }
        }

        return "YES";
    }
}
