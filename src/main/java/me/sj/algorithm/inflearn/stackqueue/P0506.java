package me.sj.algorithm.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 쇠막대기
 */
public class P0506 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        P0506 p0506 = new P0506();

        System.out.println(p0506.solutionMine(n, k));
    }

    public int solutionMine(int n, int k) {
        int answer = 0;

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                Integer value = queue.poll();
                queue.offer(value);
            }

            queue.poll();
        }

        answer = queue.poll();

        return answer;
    }
}
