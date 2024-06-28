package me.sj.algorithm.inflearn.sort;

import java.util.Scanner;

/**
 * LRU 캐시
 * 캐시메모리는 CPU와 주기억장치(DRAM) 사이의 고속의 임시 메모리로서 CPU가 처리할 작업을 저장해 놓았다가
 * <p>
 * 필요할 바로 사용해서 처리속도를 높이는 장치이다. 워낙 비싸고 용량이 작아 효율적으로 사용해야 한다.
 * <p>
 * 철수의 컴퓨터는 캐시메모리 사용 규칙이 LRU 알고리즘을 따른다.
 * <p>
 * LRU 알고리즘은 Least Recently Used 의 약자로 직역하자면 가장 최근에 사용되지 않은 것 정도의 의미를 가지고 있습니다.
 * <p>
 * 캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것을 제거하겠다는 알고리즘입니다.
 * <p>
 * 캐시의 크기가 주어지고, 캐시가 비어있는 상태에서 N개의 작업을 CPU가 차례로 처리한다면 N개의 작업을 처리한 후
 * <p>
 * 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램을 작성하세요.
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

            for (int i = 0; i < cache.length; i++) {
                if (cache[i] == w) {
                    isHit = true;
                    idx = i;
                }
            }
            // hit
            if (isHit) {
                // cache 대상 인덱스 까지 뒤로 한칸씩 밀기
                for (int i = idx; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }

                cache[0] = w;

            } else {
                // miss
                // 뒤로 한칸씩 밀기
                for (int i = cache.length - 1; i >= 1; i--) {
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
