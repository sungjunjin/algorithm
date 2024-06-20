package me.sj.algorithm.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 올바른 괄호
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

        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
            return "YES";
        }

        return answer;
    }

    public String solutionLecture(String str) {
        String answer = "";
        return answer;
    }
}
