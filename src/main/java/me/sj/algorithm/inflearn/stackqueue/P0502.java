package me.sj.algorithm.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호문자제거
 */
public class P0502 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        P0502 p0502 = new P0502();

        System.out.println(p0502.solutionMine(str));
    }

    public String solutionMine(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // 여는 괄호는 stack에 push, 닫는 괄호는 스택에서 pop
        // stack에 값이 없으면 answer에 더한다

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                if (stack.isEmpty()) {
                    answer.append(c);
                }
            }
        }

        return answer.toString();
    }

    public String solutionLecture(String str) {
        String answer = "";
        return answer;
    }
}
