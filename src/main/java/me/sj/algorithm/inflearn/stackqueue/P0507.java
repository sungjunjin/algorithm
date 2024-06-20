package me.sj.algorithm.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 교육과정설계
 */
public class P0507 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String order = in.nextLine();
        String classes = in.nextLine();

        P0507 p0507 = new P0507();

        System.out.println(p0507.solutionMine(order, classes));
    }

    public String solutionMine(String order, String classes) {
        String answer = "NO";

        LinkedList<Character> orderQueue = new LinkedList<>();
        LinkedList<Character> classQueue = new LinkedList<>();

        for (char c : order.toCharArray()) {
            orderQueue.offer(c);
        }

        for (char c : classes.toCharArray()) {
            classQueue.offer(c);
        }

        for (int i = 0; i < classes.length(); i++) {

            Character tmp = classQueue.poll();

            if (orderQueue.contains(tmp)) {
                classQueue.offer(tmp);
            }
        }

        if (orderQueue.equals(classQueue)) {
            answer = "YES";
        }

        return answer;
    }

    public String solutionLecture(String need, String plan) {
        String answer = "YES";

        LinkedList<Character> queue = new LinkedList<>();

        for (char c : need.toCharArray()) {
            queue.offer(c);
        }

        for (char c : plan.toCharArray()) {
            if(queue.contains(c)) {
                if(c != queue.poll()) {
                    return "NO";
                }
            }
        }

        if(!queue.isEmpty()) {
            return "NO";
        }


        return answer;
    }
}
