package me.sj.algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Stack;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class P12906 {
    /**
     * 스택 풀이
     */
    public int[] stackSolution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // 맨 처음에 한개는 넣음
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int peek = stack.peek();
            if ((arr[i] != peek)) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    /**
     * 배열 풀이
     */
    public int[] arraySolution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 맨 처음에 한개는 넣음
        arrayList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arrayList.add(arr[i]);
            }
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
