package me.sj.algorithm.inflearn.sort;

import java.util.Scanner;

/**
 * LRU 캐시
 */
public class P0604 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P0604 p0604 = new P0604();
        int s = in.nextInt();
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int a : p0604.solutionMine(s, arr)) {
            System.out.print(a + " ");
        }
    }

    public int[] solutionMine(int cacheSize, int[] works) {
        int[] cache = new int[cacheSize];

        for (int w : works) {
            // miss & hit 여부 조회
            boolean isHit = false;
            int idx = 0;

            for (int i=0;i<cache.length;i++) {
                if (cache[i] == w) {
                    isHit = true;
                    idx = i;
                }
            }
            // hit
            if (isHit) {
                // cache 대상 인덱스 까지 뒤로 한칸씩 밀기
                for (int i = idx; i >= 1; i--) {
                    cache[i] = cache[i- 1];
                }

                cache[0] = w;

            } else {
                // miss
                // 뒤로 한칸씩 밀기
                for (int i = cache.length - 1; i >=1; i--) {
                    cache[i] = cache[i - 1];
                }

                cache[0] = w;
            }
        }

        return cache;
    }

    public int[] solutionLecture(int[] arr) {

        return arr;
    }
}
