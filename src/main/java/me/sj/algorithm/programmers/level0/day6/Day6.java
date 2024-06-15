package me.sj.algorithm.programmers.level0.day6;

public class Day6 {
    public int clothingStore(int price) {
        if(price >= 500_000) {
            return (int) (price - (price * 0.2));
        }

        if(price >= 300_000) {
            return (int) (price - (price * 0.1));
        }

        if(price >= 100_000) {
            return (int) (price - (price * 0.05));
        }

        return price;
    }

    public int[] iceAmericano(int money) {
        int[] answer = new int[2];

        final int price = 5500;

        int coffeeCount = 0;

        // 돈 - (5500 * 커피개수)가 5500 이상 일때까지 커피 개수를 한개씩 올린다
        while(money - (price * coffeeCount) >= price) {
            coffeeCount = coffeeCount + 1;
        }

        // 잔돈을 구한다
        int remains = money - (price * coffeeCount);

        answer[0] = coffeeCount;
        answer[1] = remains;

        return answer;
    }

    public int getAge(int age) {
        final int year = 2022;

        return (year - age) + 1;

    }

    public int[] reverseArray(int[] num_list) {
        // 사이즈 만큼의 새로운 배열 할당
        int[] answer = new int[num_list.length];
        // 거꾸로 담는다

        for(int i = 0; i<num_list.length; i++) {
            answer[i] = num_list[(num_list.length - 1) - i];
        }

        return answer;
    }
}
