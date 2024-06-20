package me.sj.algorithm.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 응급실
 */
public class P0508 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        P0508 p0508 = new P0508();

        System.out.println(p0508.solutionMine(arr, k));
    }

    class Person {
        int index;
        int priority;

        public Person(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public int solutionMine(int[] arr, int k) {
        int answer = 0;
        LinkedList<Person> queue = new LinkedList<>();

        for(int i=0;i<arr.length;i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while(!queue.isEmpty()) {
            Person tmp = queue.poll();
            // queue안에 있는 우선순위(priority)를 전부 다 확인
            for(Person p : queue) {
                if(p.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if(tmp != null) {
                answer++;

                if(tmp.index == k) {
                    return answer;
                }
            }
        }

        return 0;
    }
}
