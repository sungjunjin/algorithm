package me.sj.algorithm.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 결혼식
 * 현수는 다음 달에 결혼을 합니다.
 * <p>
 * 현수는 결혼식 피로연을 장소를 빌려 3일간 쉬지 않고 하려고 합니다.
 * <p>
 * 피로연에 참석하는 친구들 N명의 참석하는 시간정보를 현수는 친구들에게 미리 요구했습니다.
 * <p>
 * 각 친구들은 자신이 몇 시에 도착해서 몇 시에 떠날 것인지 현수에게 알려주었습니다.
 * <p>
 * 현수는 이 정보를 바탕으로 피로연 장소에 동시에 존재하는 최대 인원수를 구하여 그 인원을 수용할 수 있는 장소를 빌리려고 합니다. 여러분이 현수를 도와주세요.
 * <p>
 * 만약 한 친구가 오는 시간 13, 가는시간 15라면 이 친구는 13시 정각에 피로연 장에 존재하는 것이고 15시 정각에는 존재하지 않는다고 가정합니다.
 **/
public class P0903 {
    static class Time implements Comparable<Time> {
        int start;
        char c;

        public Time(int start, char c) {
            this.start = start;
            this.c = c;
        }

        @Override
        public int compareTo(Time o) {
            if(this.start == o.start) {
                return this.c - o.c;
            }

            return this.start - o.start;
        }
    }

    public static void main(String[] args) {
        P0903 p0903 = new P0903();
        Scanner in = new Scanner(System.in);

        // 지원자의 수
        int n = in.nextInt();

        ArrayList<Time> times = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = in.nextInt();
            times.add(new Time(start, 's'));
            int end = in.nextInt();
            times.add(new Time(end, 'e'));
        }

        System.out.println(p0903.solutionMine(times));
    }

    public int solutionMine(List<Time> times) {
        int answer = 0;
        int cnt = 0;

        Collections.sort(times);

        for(Time t : times) {
            if(t.c == 'e') {
                cnt--;
            } else {
                cnt++;
            }

            answer = Math.max(cnt, answer);
        }

        return answer;
    }
}
