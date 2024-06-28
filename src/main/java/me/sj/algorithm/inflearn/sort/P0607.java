package me.sj.algorithm.inflearn.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 좌표정렬
 * N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
 * <p>
 * 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
 */
public class P0607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0607 p0607 = new P0607();
        int n = in.nextInt();

        ArrayList<Point> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            arrayList.add(new Point(x, y));
        }
        p0607.solutionMine(arrayList);

        for (Point point : arrayList) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }
        }
    }

    public void solutionMine(ArrayList<Point> arrayList) {
        Collections.sort(arrayList);
    }

}
