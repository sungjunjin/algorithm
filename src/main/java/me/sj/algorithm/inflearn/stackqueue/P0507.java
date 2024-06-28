package me.sj.algorithm.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 교육과정설계
 * 현수는 1년 과정의 수업계획을 짜야 합니다.
 * <p>
 * 수업중에는 필수과목이 있습니다. 이 필수과목은 반드시 이수해야 하며, 그 순서도 정해져 있습니다.
 * <p>
 * 만약 총 과목이 A, B, C, D, E, F, G가 있고, 여기서 필수과목이 CBA로 주어지면 필수과목은 C, B, A과목이며 이 순서대로 꼭 수업계획을 짜야 합니다.
 * <p>
 * 여기서 순서란 B과목은 C과목을 이수한 후에 들어야 하고, A과목은 C와 B를 이수한 후에 들어야 한다는 것입니다.
 * <p>
 * 현수가 C, B, D, A, G, E로 수업계획을 짜면 제대로 된 설계이지만
 * <p>
 * C, G, E, A, D, B 순서로 짰다면 잘 못 설계된 수업계획이 됩니다.
 * <p>
 * 수업계획은 그 순서대로 앞에 수업이 이수되면 다음 수업을 시작하다는 것으로 해석합니다.
 * <p>
 * 수업계획서상의 각 과목은 무조건 이수된다고 가정합니다.
 * <p>
 * 필수과목순서가 주어지면 현수가 짠 N개의 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력하는 프로그램을 작성하세요.
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
            if (queue.contains(c)) {
                if (c != queue.poll()) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }


        return answer;
    }
}
