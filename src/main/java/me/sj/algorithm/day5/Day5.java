package me.sj.algorithm.day5;

public class Day5 {
    /**
     * 피자 나눠 먹기 1
     */
    public int pizza1(int n) {
        // 일곱 조각
        int piece = 7;

        // 맨 처음 피자의 개수는 1
        int pizzaCount = 1;

        // 7 * 피자 개수 / 사람 수가 1 미만이면 피자를 한개씩 증가
        while((piece * pizzaCount) / n < 1) {
            pizzaCount = pizzaCount + 1;
        }

        return pizzaCount;
    }

    /**
     * 피자 나눠 먹기 2
     */
    public int pizza2(int n) {
        // 여섯 조각
        int piece = 6;

        // 맨 처음 피자의 개수는 1
        int pizzaCount = 1;

        // (6 * 피자 개수) / 사람 수의 나머지가 0이 아니면, 피자를 한개씩 증가
        while((piece * pizzaCount) % n != 0) {
            pizzaCount = pizzaCount + 1;
        }

        return pizzaCount;
    }

    /**
     * 피자 나눠 먹기 3
     */
    public int pizza3(int slice, int n) {
        int pizzaCount = 1;

        while((slice * pizzaCount) / n < 1) {
            pizzaCount = pizzaCount + 1;
        }

        return pizzaCount;
    }

    public double arrayAvg(int[] numbers) {
        int sum = 0;

        for(int n: numbers) {
            sum += n;
        }

        return (double)sum / numbers.length;
    }
}
