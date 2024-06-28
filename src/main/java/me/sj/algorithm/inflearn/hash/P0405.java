package me.sj.algorithm.inflearn.hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * K번째 큰 수
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 * <p>
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 * <p>
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 */
public class P0405 {
    public static void main(String[] args) {
        P0405 p0405 = new P0405();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(p0405.solutionMine(arr, k));

    }

    public int solutionMine(int arr[], int k) {
        int answer = 0;
        // 합산을 저장할 set
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        // 배열에서 랜덤한 3개를 뽑을 때
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : set) {
            cnt++;

            if (cnt == k) {
                return x;
            }
        }

        return -1;
    }
}
