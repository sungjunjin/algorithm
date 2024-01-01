package me.sj.algorithm.day3;

/**
 * 프로그래머스 코딩테스트 입문
 */
public class Day3 {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int isEqual(int num1, int num2) {
        boolean result = num1 == num2;

        if(result) {
            return 1;
        }

        return - 1;
    }

    public int remain(int num1, int num2) {
        return num1 % num2;
    }

    public int remainInteger(int num1, int num2) {
        double result = (double) num1 / num2;

        // 소숫점의 정수부 구하기
        return (int) (result * 1000);
    }

    public int[] arrayDouble(int[] numbers) {
        // 정수형 배열 할당
        int[] answer = new int[numbers.length];

        for(int i=0;i<numbers.length;i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
