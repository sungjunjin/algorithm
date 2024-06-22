package me.sj.algorithm.inflearn.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 좌표정렬
 */
public class P0607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0607 p0607 = new P0607();
        int n = in.nextInt();

        ArrayList<Point> arrayList = new ArrayList<>();

        for(int i=0;i<n;i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            arrayList.add(new Point(x,y));
        }
        p0607.solutionMine(arrayList);

        for(Point point : arrayList) {
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
            if(this.x == o.x) {
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
