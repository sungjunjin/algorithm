package me.sj.algorithm.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 회의실 배정
 * <p>
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들려고 한다.
 * <p>
 * 각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라.
 * <p>
 * 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
 */
public class P0902 {
    static class Meeting implements Comparable<Meeting> {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            // 끝나는 시간이 같으면 시작 시간으로 오름차순 정렬
            if(this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }

    public static void main(String[] args) {
        P0902 p0902 = new P0902();
        Scanner in = new Scanner(System.in);

        // 지원자의 수
        int n = in.nextInt();

        ArrayList<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = in.nextInt();
            int end = in.nextInt();

            meetings.add(new Meeting(start, end));
        }

        System.out.println(p0902.solutionMine(meetings));
    }

    public int solutionMine(List<Meeting> meetings) {
        int cnt = 0;

        Collections.sort(meetings);

        int end = 0;
        for (Meeting m : meetings) {
            if (m.start >= end) {
                end = m.end;
                cnt++;
            }
        }
        return cnt;
    }
}
