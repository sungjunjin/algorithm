package me.sj.algorithm.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 */
public class P0504 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        P0504 p0504 = new P0504();

        System.out.println(p0504.solutionMine(str));
    }

    public int solutionMine(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int right = stack.pop();
                int left = stack.pop();

                stack.push(operate(right, left, c));
            }
        }

        return stack.pop();
    }

    public int operate(int right, int left, char c) {
        if (c == '+') return left + right;
        if (c == '-') return left - right;
        if (c == '*') return left * right;
        if (c == '/') return left / right;

        return 0;
    }
}
