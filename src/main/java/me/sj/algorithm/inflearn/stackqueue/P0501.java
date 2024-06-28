package me.sj.algorithm.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 올바른 괄호
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * <p>
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 */
public class P0501 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        P0501 p0501 = new P0501();

        System.out.println(p0501.solutionMine(str));
    }

    public String solutionMine(String str) {
        String answer = "NO";

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }

        return answer;
    }

    public String solutionLecture(String str) {
        String answer = "";
        return answer;
    }
}
