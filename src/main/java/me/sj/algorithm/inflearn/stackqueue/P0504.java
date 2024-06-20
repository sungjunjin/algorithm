package me.sj.algorithm.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산
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

        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
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
        if(c == '+') return left + right;
        if(c == '-') return left - right;
        if(c == '*') return left * right;
        if(c == '/') return left / right;

        return 0;
    }
}
