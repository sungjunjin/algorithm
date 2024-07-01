package me.sj.algorithm.backjoon.hash;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 상근이는 카드 n(4 ≤ n ≤ 10)장을 바닥에 나란히 놓고 놀고있다. 각 카드에는 1이상 99이하의 정수가 적혀져 있다.
 * 상근이는 이 카드 중에서 k(2 ≤ k ≤ 4)장을 선택하고, 가로로 나란히 정수를 만들기로 했다.
 * 상근이가 만들 수 있는 정수는 모두 몇 가지일까?
 * <p>
 * 예를 들어, 카드가 5장 있고, 카드에 쓰여 있는 수가 1, 2, 3, 13, 21라고 하자.
 * 여기서 3장을 선택해서 정수를 만들려고 한다. 2, 1, 13을 순서대로 나열하면 정수 2113을 만들 수 있다. 또, 21, 1, 3을 순서대로 나열하면 2113을 만들 수 있다.
 * 이렇게 한 정수를 만드는 조합이 여러 가지 일 수 있다.
 * <p>
 * n장의 카드에 적힌 숫자가 주어졌을 때, 그 중에서 k개를 선택해서 만들 수 있는 정수의 개수를 구하는 프로그램을 작성하시오.
 **/
public class P5568 {
    static int[] arr;
    static int[] ch;
    HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        P5568 p5568 = new P5568();
        Scanner in = new Scanner(System.in);

        // 카드의 수
        int n = in.nextInt();
        arr = new int[n];
        ch = new int[n];
        // 선택할 수 있는 카드의 수
        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int answer = p5568.solutionMine(k);
        System.out.println(answer);

    }

    public int solutionMine(int k) {
        dfs(0, "", k);
        return set.size();
    }

    public void dfs(int level, String num, int k) {
        if (level == k) {
            set.add(Integer.parseInt(num));
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    dfs(level + 1, arr[i] + num, k);
                    ch[i] = 0;
                }
            }
        }
    }
}
