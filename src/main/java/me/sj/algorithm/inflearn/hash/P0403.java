package me.sj.algorithm.inflearn.hash;

import java.util.*;

/**
 * 매출액의 종류 (해시, Sliding Window)
 * 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
 * <p>
 * 각 구간별로 구하라고 했습니다.
 * <p>
 * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
 * <p>
 * 20 12 20 10 23 17 10
 * <p>
 * 각 연속 4일간의 구간의 매출종류는
 * <p>
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
 * <p>
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
 * <p>
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
 * <p>
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
 * <p>
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
 * <p>
 * 매출액의 종류를 출력하는 프로그램을 작성하세요.
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
