package me.sj.algorithm.inflearn.hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 매출액의 종류 (해시, Sliding Window)
 */
public class P0404 {
    public static void main(String[] args) {
        P0404 p0404 = new P0404();
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String target = in.nextLine();

        int answer = p0404.solutionMine(str, target);

        System.out.println(answer);

    }

    public int solutionMine(String input, String target) {
        int answer = 0;
        int left = 0;

        HashMap<Character, Integer> targetMap = new HashMap<>();

        for(char c : target.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // 0,1,2 먼저 검사
        for (int i = 0; i < target.length(); i++) {
            map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);

            if(map.equals(targetMap)) answer++;

        }

        // two pointer
        for (int right = target.length(); right < input.length(); right++) {
            map.put(input.charAt(right), map.getOrDefault(input.charAt(right), 0) + 1);

            // left 처리
            int value = map.get(input.charAt(left));
            if(value == 1) {
                map.remove(input.charAt(left));
            } else {
                map.put(input.charAt(left), map.get(input.charAt(left)) - 1);
            }

            if(map.equals(targetMap)) {
                answer++;
            }

            // left 한칸 이동
            left = left + 1;
        }

        return answer;
    }
}
