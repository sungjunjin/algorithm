package me.sj.algorithm.backjoon.hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 총총이는 친구 곰곰이의 소개로 제2회 곰곰컵에 출연할 기회를 얻었다!
 * <p>
 * 총총이는 자신의 묘기인 무지개 댄스를 선보여, 여러분의 환심을 사려 한다. 이 댄스는 중독성이 강하기 때문에, 한번 보게 된 사람은 모두 따라 하게 돼버린다.
 * <p>
 * 무지개 댄스를 추는 총총 2마리
 * <p>
 * 사람들이 만난 기록이 시간 순서대로
 * $N$개 주어진다. (총총이는 토끼이지만 이 문제에서는 편의상 사람이라고 가정한다.)
 * <p>
 * 무지개 댄스를 추지 않고 있던 사람이 무지개 댄스를 추고 있던 사람을 만나게 된다면, 만난 시점 이후로 무지개 댄스를 추게 된다.
 * <p>
 * 기록이 시작되기 이전 무지개 댄스를 추고 있는 사람은 총총이 뿐이라고 할 때, 마지막 기록 이후 무지개 댄스를 추는 사람이 몇 명인지 구해보자!
 **/
public class P26069 {
    static HashMap<String, Boolean> map = new HashMap<>();

    public static void main(String[] args) {
        P26069 p26069 = new P26069();
        Scanner in = new Scanner(System.in);

        // 사람들이 만난 기록 수
        int n = in.nextInt();
        in.nextLine();

        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = in.nextLine();
            String[] split = strArr[i].split(" ");
            map.put(split[0], false);
            map.put(split[1], false);
        }

        int answer = p26069.solutionMine(strArr);
        System.out.println(answer);

    }

    public int solutionMine(String[] strArr) {
        int answer = 0;

        for (String s : strArr) {
            String[] people = s.split(" ");

            if (people[0].equals("ChongChong")) {
                map.put(people[1], true);
            } else if (people[1].equals("ChongChong")) {
                map.put(people[0], true);
            } else if (map.get(people[0])) {
                map.put(people[1], true);
            } else if (map.get(people[1])) {
                map.put(people[0], true);
            }
        }

        for (String name : map.keySet()) {
            if (map.get(name)) {
                answer++;
            }
        }

        // 총총이도 포함
        return answer + 1;
    }
}
