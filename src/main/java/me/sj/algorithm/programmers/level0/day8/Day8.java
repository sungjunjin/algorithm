package me.sj.algorithm.programmers.level0.day8;

public class Day8 {
    public String removeChar(String my_string, String letter) {
//        String.replace()로도 풀이 가능
//        return my_string.replace(letter, "");

        char[] charArray = my_string.toCharArray();
        char target = letter.charAt(0);

        for (int i = 0; i < my_string.length(); i++) {
            if (charArray[i] == target) {
                charArray[i] = 0;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (charArray[i] == 0) continue;
            sb.append(charArray[i]);
        }

        return sb.toString();

    }

    public int angle(int angle) {
        if (angle == 180) {
            return 4;
        } else if (angle > 90) {
            return 3;
        } else if (angle == 90) {
            return 2;
        } else {
            return 1;
        }
    }

    public int lamb(int n, int k) {
        int lambPrice = 12_000;
        int drinkPrice = 2_000;

        int serviceDrinks = n / 10;
        int numOfDrinkToPay = k - serviceDrinks;

        return (lambPrice * n) + (numOfDrinkToPay * drinkPrice);
    }

    public int sumOfEven(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

}
