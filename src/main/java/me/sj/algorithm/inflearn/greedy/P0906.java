package me.sj.algorithm.inflearn.greedy;

import java.util.*;

/**
 * 친구인가? ((Disjoint-Set : Union&Find)
 * <p>
 * 오늘은 새 학기 새로운 반에서 처음 시작하는 날이다. 현수네 반 학생은 N명이다. 현수는 각 학생들의 친구관계를 알고 싶다.
 * <p>
 * 모든 학생은 1부터 N까지 번호가 부여되어 있고, 현수에게는 각각 두 명의 학생은 친구 관계가 번호로 표현된 숫자쌍이 주어진다.
 * <p>
 * 만약 (1, 2), (2, 3), (3, 4)의 숫자쌍이 주어지면 1번 학생과 2번 학생이 친구이고, 2번 학생과 3번 학생이 친구, 3번 학생과 4번 학생이 친구이다.
 * <p>
 * 그리고 1번 학생과 4번 학생은 2번과 3번을 통해서 친구관계가 된다.
 * <p>
 * 학생의 친구관계를 나타내는 숫자쌍이 주어지면 특정 두 명이 친구인지를 판별하는 프로그램을 작성하세요.
 * <p>
 * 두 학생이 친구이면 “YES"이고, 아니면 ”NO"를 출력한다.
 **/
public class P0906 {
    // 서로소 집합의 표현
    static int[] unf;

    public static void main(String[] args) {
        P0906 p0906 = new P0906();
        Scanner in = new Scanner(System.in);

        // 반 학생 수
        int n = in.nextInt();
        unf = new int[n + 1];

        for (int i = 0; i < unf.length; i++) {
            unf[i] = i;
        }

        // 숫자쌍의 개수
        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            int idx = in.nextInt();
            int friendsWith = in.nextInt();

            union(idx, friendsWith);
        }

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(p0906.solutionMine(a ,b));
    }

    public static int find(int v) {
        if (v == unf[v]) {
            return v;
        } else {
            // 집합 번호를 구한다
            return unf[v] = find(unf[v]);
        }
    }

    public static void union(int a, int b) {
        int friendA = find(a);
        int friendB = find(b);

        if (friendA != friendB) {
            unf[friendA] = friendB;
        }
    }

    public String solutionMine(int a, int b) {
        if(find(a) == find(b)) {
            return "YES";
        }

        return "NO";
    }
}
