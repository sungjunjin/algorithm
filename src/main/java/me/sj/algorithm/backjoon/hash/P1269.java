package me.sj.algorithm.backjoon.hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다. 이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오. 두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.
 * <p>
 * 예를 들어, A = { 1, 2, 4 } 이고, B = { 2, 3, 4, 5, 6 } 라고 할 때,  A-B = { 1 } 이고, B-A = { 3, 5, 6 } 이므로, 대칭 차집합의 원소의 개수는 1 + 3 = 4개이다.
 */
public class P1269 {
    public static void main(String[] args) {
        P1269 p1269 = new P1269();

        Scanner in = new Scanner(System.in);

        int aLength = in.nextInt();
        int bLength = in.nextInt();

        HashMap<Integer, Integer> aMap = new HashMap<>();
        HashMap<Integer, Integer> bMap = new HashMap<>();

        for (int i = 0; i < aLength; i++) {
            aMap.put(in.nextInt(), 1);
        }

        for (int i = 0; i < bLength; i++) {
            bMap.put(in.nextInt(), 1);
        }

        System.out.println(p1269.solutionMine(aMap, bMap));

    }

    public int solutionMine(HashMap<Integer, Integer> aMap, HashMap<Integer, Integer> bMap) {
        int answer = 0;

        // A - B
        for (int b : bMap.keySet()) {
            if (!aMap.containsKey(b)) {
                answer++;
            }
        }

        // B - A
        for (int a : aMap.keySet()) {
            if (!bMap.containsKey(a)) {
                answer++;
            }
        }

        return answer;
    }
}
