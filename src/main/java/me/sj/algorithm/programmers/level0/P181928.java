package me.sj.algorithm.programmers.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181928
 */
public class P181928 {
    public int solution(int[] num_list) {
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();

        for (int num : num_list) {
            if(num % 2 == 0) {
                evenSb.append(num);
            } else {
                oddSb.append(num);
            }
        }

        return Integer.parseInt(oddSb.toString()) + Integer.parseInt(evenSb.toString());
    }
}
