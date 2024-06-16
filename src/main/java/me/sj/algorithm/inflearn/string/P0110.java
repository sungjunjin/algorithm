package me.sj.algorithm.inflearn.string;

import java.util.Scanner;

/**
 * 숫자만 추출
 */
public class P0110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] split = str.split(" ");

        P0110 p0110 = new P0110();

        int[] answer = p0110.solutionLecture(split[0], split[1].charAt(0));

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }

    public int[] solutionMine(String str, char target) {
        int[] answer = new int[str.length()];
        boolean isPassed = false;

        char[] charArr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (charArr[i] == target) {
                isPassed = true;
            }

            int rightMin = str.length();
            int rightCount = 0;

            // 오른쪽 먼저 카운트
            for (int j = i; j < str.length(); j++) {
                if (charArr[j] == target) {
                    if (rightMin > rightCount) rightMin = rightCount;
                } else {
                    rightCount++;
                }
            }

            int leftMin = str.length();
            int leftCount = 0;

            // target을 지났으면 왼쪽 방향으로도 카운트
            if (isPassed) {
                for (int j = i; j >= 0; j--) {
                    if (charArr[j] == target) {
                        if (leftMin > leftCount) leftMin = leftCount;
                    } else {
                        leftCount++;
                    }
                }
            }

            answer[i] = Math.min(rightMin, leftMin);
        }

        return answer;
    }

    public int[] solutionLecture(String str, char target) {
        int[] answer = new int[str.length()];

        int p = 1000;

        // 오른쪽
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        // 오른쪽
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == target) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);

            }
        }

        return answer;
    }
}
