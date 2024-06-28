package me.sj.algorithm.inflearn.array;

import java.util.*;

/**
 * 등수구하기
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * <p>
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * <p>
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 */
public class P0208 {
    public static void main(String[] args) {
        P0208 p0208 = new P0208();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] answer = p0208.solutionMine(arr);

        for(int a : answer) {
            System.out.print(a + " ");
        }

    }

    public int[] solutionMine(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        Map<Integer, Integer> scoreMap = new HashMap<>();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            scoreMap.put(arr[i], arr.length - i);
        }


        for(int i = 0; i < arr.length; i++) {
            answer[i] = scoreMap.get(answer[i]);
        }

        return answer;
    }
}
