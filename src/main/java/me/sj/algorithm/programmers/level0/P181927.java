package me.sj.algorithm.programmers.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */
public class P181927 {
    public int[] solution(int[] num_list) {
        int answerArrLength = num_list.length + 1;
        int[] answer = new int[answerArrLength];

        int last;

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            last = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            last = num_list[num_list.length - 1] * 2;
        }

        for(int i=0;i<num_list.length;i++) {
            answer[i] = num_list[i];
        }

        answer[answerArrLength - 1] = last;

        return answer;
    }
}
