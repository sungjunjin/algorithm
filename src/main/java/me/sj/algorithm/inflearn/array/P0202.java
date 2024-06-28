package me.sj.algorithm.inflearn.array;

import java.util.Scanner;

/**
 * 보이는 학생
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * <p>
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 */
public class P0202 {
    public static void main(String[] args) {
        P0202 p0202 = new P0202();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p0202.solutionLecture(arr));
    }

    public int solutionMine(int[] arr) {
        // 앞에는 무조건 보임
        int answer = 1;

        // 그동안 가장 큰 애, 맨 앞 학생의 키로 초기화
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1] && arr[i + 1] > max) {
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
                answer++;
            }
        }

        return answer;
    }

    public int solutionLecture(int[] arr) {
        // 앞에는 무조건 보임
        int answer = 1, max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    }
}
