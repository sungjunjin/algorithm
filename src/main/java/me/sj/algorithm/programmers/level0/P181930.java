package me.sj.algorithm.programmers.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181930
 */
public class P181930 {
    public int solution(int a, int b, int c) {
        int count = 0;

        if(a == b) {
            count += 1;
        }

        if(b == c) {
            count += 1;
        }

        if(c == a) {
            count += 1;
        }

        if(count == 3) {
            return (a+b+c) + (a*a + b*b + c*c) + (a*a*a + b*b*b + c*c*c);
        }

        if(count == 0) {
            return (a+b+c);
        }

        return (a+b+c) + (a*a + b*b + c*c);
    }

    public static void main(String[] args) {

    }
}
