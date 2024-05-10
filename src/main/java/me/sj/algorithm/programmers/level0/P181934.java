package me.sj.algorithm.programmers.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */
public class P181934 {
    public int solution(String ineq, String eq, int n, int m) {
        String operator = ineq;

        if(!eq.equals("!")) {
            operator = operator + eq;
        }

        boolean result = false;
        switch (operator) {
            case ">":
                result = n > m;
                break;
            case "<" :
                result = n < m;
                break;
            case ">=" :
                result = n >= m;
                break;
            case "<=" :
                result = n <= m;
        }

        if(result) {
            return 1;
        } else {
            return 0;
        }
    }
}
