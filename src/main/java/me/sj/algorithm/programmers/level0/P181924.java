package me.sj.algorithm.programmers.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181924
 */
public class P181924 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q: queries) {
            int i = q[0];
            int j = q[1];

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}
