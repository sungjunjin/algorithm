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
    // 중복을 허용하지 않으므로 check 배열이 필요하다
    static boolean[] ch;

    public static void main(String[] args) {
        Permutation p0803 = new Permutation();
        Scanner in = new Scanner(System.in);

        // 자연수 n
        n = in.nextInt();
        // r
        m = in.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // 중복 체크 배열
        ch = new boolean[n];
        pm = new int[m];

        p0803.dfs(0);
    }

    public void dfs(int level) {
        if (level == m) {
            for(int p : pm) {
                System.out.print(p + " ");
            }
            System.out.println();

        } else {
            for (int i = 0; i < arr.length; i++) {
                if(!ch[i]) {
                    ch[i] = true;
                    pm[level] = arr[i];
                    dfs(level + 1);
                    ch[i] = false;
                }
            }
        }
    }
}
