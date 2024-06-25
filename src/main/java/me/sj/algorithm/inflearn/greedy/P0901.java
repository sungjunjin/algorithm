package me.sj.algorithm.inflearn.greedy;

import java.util.*;

/**
 * 씨름 선수
 * 현수는 씨름 감독입니다. 현수는 씨름 선수를 선발공고를 냈고, N명의 지원자가 지원을 했습니다.
 * <p>
 * 현수는 각 지원자의 키와 몸무게 정보를 알고 있습니다.
 * <p>
 * 현수는 씨름 선수 선발 원칙을 다음과 같이 정했습니다.
 * <p>
 * “A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자 보다 높은(크고, 무겁다) 지원자가
 * <p>
 * 존재하면 A지원자는 탈락하고, 그렇지 않으면 선발된다.”
 * <p>
 * N명의 지원자가 주어지면 위의 선발원칙으로 최대 몇 명의 선수를 선발할 수 있는지 알아내는 프로그램을 작성하세요.
 */
public class P0901 {
    static class Player implements Comparable<Player> {
        int weight;
        int height;

        public Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Player o) {
            // 내림차순 정렬
            return o.height - this.height;
        }
    }

    public static void main(String[] args) {
        P0901 p0901 = new P0901();
        Scanner in = new Scanner(System.in);

        // 지원자의 수
        int n = in.nextInt();

        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int height = in.nextInt();
            int weight = in.nextInt();

            players.add(new Player(height, weight));

        }

        System.out.println(p0901.solutionMine(players));

    }

    public int solutionMine(List<Player> players) {
        int cnt = 0;

        // 내림차순 정렬
        Collections.sort(players);

        int max = Integer.MIN_VALUE;

        for(Player p : players) {
            if(p.weight > max) {
                max = p.weight;
                cnt++;
            }
        }

        return cnt;
    }
}
