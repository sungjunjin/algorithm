package me.sj.algorithm.inflearn.greedy;

import java.util.*;

/**
 * 최대 수입 스케쥴(PriorityQueue 응용문제)
 * <p>
 * 현수는 유명한 강연자이다. N개이 기업에서 강연 요청을 해왔다. 각 기업은 D일 안에 와서 강연을 해 주면 M만큼의 강연료를 주기로 했다.
 * <p>
 * 각 기업이 요청한 D와 M를 바탕으로 가장 많을 돈을 벌 수 있도록 강연 스케쥴을 짜야 한다.
 * <p>
 * 단 강연의 특성상 현수는 하루에 하나의 기업에서만 강연을 할 수 있다.
 **/
public class P0904 {
    static class Lecture implements Comparable<Lecture> {
        int money;
        int day;

        public Lecture(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.day - this.day;
        }
    }

    public static void main(String[] args) {
        P0904 p0904 = new P0904();
        Scanner in = new Scanner(System.in);

        ArrayList<Lecture> lectures = new ArrayList<>();
        // 지원자의 수
        int n = in.nextInt();

        int maxDate = 0;
        for (int i = 0; i < n; i++) {
            // 강연료
            int m = in.nextInt();
            // 일
            int d = in.nextInt();

            lectures.add(new Lecture(m, d));
            if (d > maxDate) {
                maxDate = d;
            }
        }

        Collections.sort(lectures);

        System.out.println(p0904.solutionMine(lectures, maxDate));
    }

    public int solutionMine(ArrayList<Lecture> lectures, int maxDate) {
        int answer = 0;

        // 가장 큰 값을 꺼내줘야 하기 때문에 Collections.reverseOrder()를 인자로 넣어준다
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        int j =0;
        for (int i = maxDate; i > 0; i--) {
            for(; j<lectures.size();j++) {
                Lecture lecture = lectures.get(j);
                if(lecture.day < i) {
                    break;
                } {
                    priorityQueue.add(lecture.money);
                }
            }
            if(!priorityQueue.isEmpty()) {
                answer += priorityQueue.poll();
            }
        }

        return answer;
    }
}
