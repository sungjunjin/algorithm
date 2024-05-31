package me.sj.algorithm.programmers.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */
public class P181923 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;

        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];
            int k = q[2];


            int min = arr[s];
            for (int i = s; i <= e; i++) {
                int num = arr[i];


                if (num >= k + 1) {
                    if(min > num) {
                        min = num;
                    }

                    answer[index] = min;
                } else {
                    answer[index] = -1;
                }
            }

            index++;
        }

        return answer;
    }
}
