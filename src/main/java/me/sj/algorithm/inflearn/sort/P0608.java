package me.sj.algorithm.inflearn.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이분 검색
 * 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
 * <p>
 * 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
 */
public class P0608 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0608 p0608 = new P0608();
        int n = in.nextInt();
        int target = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p0608.solutionMine(arr, target));
    }

    public int solutionLecture(int[] arr, int target) {
        int answer = 0;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        // 이진탐색
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid + 1;
            }

            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public int solutionMine(int[] arr, int target) {
        // 이진 탐색은 정렬된 상태에서 수행
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid + 1;
            }

            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return 0;
    }
}
