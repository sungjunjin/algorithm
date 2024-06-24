package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 순열(중복 x) 구하기
 */
public class Permutation {
    // 1 ~ 자연수 N
    static int n = 0;
    // 중복을 허락하여 M번을 뽑는다
    static int m = 0;
    static int[] pm;
    static int[] arr;
    static int[] ch;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Permutation p0803 = new Permutation();

        // 자연수 n
        n = in.nextInt();
        // r
        m = in.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // 중복 체크 배열
        ch = new int[n];
        pm = new int[m];

        p0803.dfs(0);
    }

    public void dfs(int level) {
        if (level == m) {
            String str = "";
            for (int i = 0; i < pm.length; i++) {
                str += pm[i] + " ";
            }

            System.out.println(str);

        } else {
            for (int i=0;i<arr.length;i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[level] = arr[i];
                    dfs(level + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}
