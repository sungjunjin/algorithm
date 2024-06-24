package me.sj.algorithm.inflearn.dfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 피자 배달 거리 (DFS)
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

            for(Point h : hs) {
                int dis = Integer.MAX_VALUE;

                for(int i : combi) {
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
