package me.sj.algorithm.inflearn.hash;

import java.util.*;

/**
 * 매출액의 종류 (해시, Sliding Window)
 */
public class P0403 {
    public static void main(String[] args) {
        P0403 p0403 = new P0403();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int a : p0403.solutionLecture(arr, k)) {
            System.out.print(a + " ");
        }
    }

    // TODO: 2024/06/19 two pointer sliding window 기법으로 풀어보기
    public ArrayList<Integer> solutionMine(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();

        int left = 0;

        for (int right = k - 1; right < arr.length; right++) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = left; i <= right; i++) {
                set.add(arr[i]);
            }

            answer.add(set.size());

            left++;
        }

        return answer;
    }

    public ArrayList<Integer> solutionLecture(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // 0부터 k-1까지 매출 세팅
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // two pointer 시작
        int left = 0;

        for (int right = k - 1; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            answer.add(map.size());

            map.put(arr[left], map.get(arr[left]) - 1);

            if (map.get(arr[left]) == 0) {
                map.remove(arr[left]);
            }

            left++;
        }

        return answer;
    }
}
