package me.sj.algorithm.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠막대기
 */
public class P0505 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        P0505 p0505 = new P0505();

        System.out.println(p0505.solutionMine(str));
    }

    public int solutionMine(String str) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if(str.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }
}
