package me.sj.algorithm.inflearn.dfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 피자 배달 거리 (DFS) -> 못품
 * N×N 크기의 도시지도가 있습니다. 도시지도는 1×1크기의 격자칸으로 이루어져 있습니다.
 * <p>
 * 각 격자칸에는 0은 빈칸, 1은 집, 2는 피자집으로 표현됩니다. 각 격자칸은 좌표(행번호, 열 번호)로 표현됩니다.
 * <p>
 * 행번호는 1번부터 N번까지이고, 열 번호도 1부터 N까지입니다.
 * <p>
 * 도시에는 각 집마다 “피자배달거리”가 았는데 각 집의 피자배달거리는 해당 집과 도시의 존재하는
 * <p>
 * 피자집들과의 거리 중 최소값을 해당 집의 “피자배달거리”라고 한다.
 * <p>
 * 집과 피자집의 피자배달거리는 |x1-x2|+|y1-y2| 이다.
 * <p>
 * 예를 들어, 도시의 지도가 아래와 같다면
 * <p>
 * <p>
 * (1, 2)에 있는 집과 (2, 3)에 있는 피자집과의 피자 배달 거리는 |1-2| + |2-3| = 2가 된다.
 * <p>
 * 최근 도시가 불경기에 접어들어 우후죽순 생겼던 피자집들이 파산하고 있습니다.
 * <p>
 * 도시 시장은 도시에 있는 피자집 중 M개만 살리고 나머지는 보조금을 주고 폐업시키려고 합니다.
 * <p>
 * 시장은 살리고자 하는 피자집 M개를 선택하는 기준으로 도시의 피자배달거리가 최소가 되는 M개의 피자집을 선택하려고 합니다.
 * <p>
 * 도시의 피자 배달 거리는 각 집들의 피자 배달 거리를 합한 것을 말합니다.
 */
public class P0814 {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, m;
    static int[] combi;
    static ArrayList<Point> pz, hs;
    static int answer = Integer.MAX_VALUE;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0814 p0814 = new P0814();

        n = in.nextInt();
        m = in.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        combi = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = in.nextInt();
                if (tmp == 1) {
                    // 집 주소 더하기
                    hs.add(new Point(i, j));
                } else if (tmp == 2) {
                    // 피자집 주소 더하기
                    pz.add(new Point(i, j));
                }
            }
        }
        System.out.println(answer);

        p0814.dfs(0, n);
    }

    public void dfs(int level, int s) {
        if (level == m) {
            int sum = 0;

            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;

                for (int i : combi) {
                    Point pizza = pz.get(i);
                    dis = Math.min(dis, Math.abs(h.x - pizza.x) + Math.abs(h.y - pizza.y));
                }

                sum += dis;
            }

            answer = Math.min(sum, answer);

        } else {
            for (int i = s; i < pz.size(); i++) {
                combi[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }

}
