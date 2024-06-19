package me.sj.algorithm.inflearn.twopointer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 두 배열 합치기
 */
public class P0301 {
    public static void main(String[] args) {
        P0301 p0301 = new P0301();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int n2 = in.nextInt();

        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }

        int[] answer = p0301.solutionMine(arr, arr2);

        for (int a : answer) {
            System.out.print(a + " ");
        }

    }

    public int[] solutionMine(int[] arr, int[] arr2) {
        int[] answer = new int[arr.length + arr2.length];

        int answerIdx = 0;
        int leftIdx = 0;
        int rightIdx = 0;

        while (answerIdx < answer.length) {
            // 왼쪽이 더 이상 없을 경우
            if (leftIdx == arr.length) {
                answer[answerIdx] = arr2[rightIdx];
                rightIdx++;
                answerIdx++;
                continue;
            }
            // 오른쪽이 더 이상 없을 경우
            if (rightIdx == arr2.length) {
                answer[answerIdx] = arr[leftIdx];
                leftIdx++;
                answerIdx++;
                continue;
            }

            // 왼쪽이 더 큰 경우
            if (arr[leftIdx] > arr2[rightIdx]) {
                answer[answerIdx] = arr2[rightIdx];
                rightIdx++;

                answerIdx++;

            // 오른쪽이 더 큰 경우
            } else if (arr[leftIdx] < arr2[rightIdx]) {
                answer[answerIdx] = arr[leftIdx];
                leftIdx++;

                answerIdx++;

            // 똑같은 경우
            } else {
                answer[answerIdx] = arr[leftIdx];
                answer[answerIdx + 1] = arr2[rightIdx];

                leftIdx++;
                rightIdx++;

                answerIdx = answerIdx + 2;
            }
        }

        return answer;
    }

    public ArrayList<Integer> solutionLecture(int[] arr, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while(p1 < arr.length && p2 < arr2.length) {
            if(arr[p1] < arr2[p2]) {
                answer.add(arr[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }

        // 나머지 배열을 넣어준다
        while(p1<arr.length) {
            answer.add(arr[p1++]);
        }

        while(p2<arr2.length) {
            answer.add(arr2[p2++]);
        }

        return answer;
    }
}
