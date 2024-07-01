package me.sj.algorithm.programmers.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Test4 test1 = new Test4();
        int[] cards = {5,3,4,4};
        int slotSize = 2;

        System.out.println(test1.solution(cards, slotSize));
    }

    public boolean solution(int[] cards, int slotSize) {
        // 카드 배열을 오름차순으로 정렬합니다.
        Arrays.sort(cards);

        // 슬롯에 담을 카드 배열을 초기화합니다.
        int[] slot = new int[slotSize];

        // 슬롯에 담을 카드 인덱스를 초기화합니다.
        int idx = 0;

        // 모든 카드를 순회합니다.
        for (int c : cards) {
            // 현재 카드가 슬롯에 담을 수 있는지 확인합니다.
            if (idx == slotSize) {
                // 슬롯이 더 이상 남아 있지 않으면 false를 반환합니다.
                return false;
            }

            // 현재 카드가 슬롯의 마지막 카드보다 크거나 같으면 false를 반환합니다.
            if (idx > 0 && slot[idx - 1] >= c) {
                return false;
            }

            // 현재 카드를 슬롯에 담습니다.
            slot[idx] = c;
            idx++;
        }

        // 모든 카드를 슬롯에 담을 수 있었으므로 true를 반환합니다.
        return true;
    }
}
