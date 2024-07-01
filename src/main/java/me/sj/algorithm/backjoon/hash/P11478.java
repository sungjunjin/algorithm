package me.sj.algorithm.backjoon.hash;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
 * <p>
 * 부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
 * <p>
 * 예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.
 **/
public class P11478 {
    public static void main(String[] args) {
        P11478 p11478 = new P11478();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(p11478.solutionMine(str));

    }

    public int solutionMine(String str) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }

        return set.size();
    }
}
