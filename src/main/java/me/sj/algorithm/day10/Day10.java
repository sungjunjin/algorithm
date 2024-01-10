package me.sj.algorithm.day10;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Day10 {
    public int ant(int hp) {
        int answer = 0;

        int general = 5;
        int soldier = 3;
        int work = 1;

        // 장군 까고
        int generalCount = hp / general;
        answer = answer + generalCount;
        hp = hp - (general * generalCount);

        if (hp == 0) return answer;

        // 병정 까고
        int soliderCount = hp / soldier;
        answer = answer + soliderCount;
        hp = hp - (soldier * soliderCount);

        if (hp == 0) return answer;

        // 일 까고
        int workCount = hp / work;
        answer = answer + workCount;

        return answer;
    }

    public String morse(String letter) {
        // 공백 기준으로 제거
        String[] splitStr = letter.split(" ");

        // 모스부호 해시맵 생성
        Map<String, Character> morseMap = new HashMap<>();
        morseMap.put(".-", 'a');
        morseMap.put("-...", 'b');
        morseMap.put("-.-.", 'c');
        morseMap.put("-..", 'd');
        morseMap.put(".", 'e');
        morseMap.put("..-.", 'f');
        morseMap.put("--.", 'g');
        morseMap.put("....", 'h');
        morseMap.put("..", 'i');
        morseMap.put(".---", 'j');
        morseMap.put("-.-", 'k');
        morseMap.put(".-..", 'l');
        morseMap.put("--", 'm');
        morseMap.put("-.", 'n');
        morseMap.put("---", 'o');
        morseMap.put(".--.", 'p');
        morseMap.put("--.-", 'q');
        morseMap.put(".-.", 'r');
        morseMap.put("...", 's');
        morseMap.put("-", 't');
        morseMap.put("..-", 'u');
        morseMap.put("...-", 'v');
        morseMap.put(".--", 'w');
        morseMap.put("-..-", 'x');
        morseMap.put("-.--", 'y');
        morseMap.put("--..", 'z');

        StringBuilder sb = new StringBuilder();
        for (String s : splitStr) {
            sb.append(morseMap.get(s));
        }

        return sb.toString();
    }

    public String rsp(String rsp) {
        // 이기는 경우의 Map 생성
        Map<String, Character> winningMap = new HashMap<>();

        winningMap.put("2", '0');
        winningMap.put("0", '5');
        winningMap.put("5", '2');

        // rsp를 char 배열로 변환
        char[] rspArray = rsp.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char r : rspArray) {
            String key = Character.valueOf(r).toString();
            sb.append(winningMap.get(key));
        }

        return sb.toString();
    }

    public int balls(int balls, int share) {
        int answer = 1;
        if (balls == share) {
            return answer;
        }
        BigInteger num1 = new BigInteger("1"); // 변수선언, parameter는 String 타입으로

        for (int i = 0; i < share; i++) {
            BigInteger num2 = new BigInteger(Integer.toString(1 + i));            //숫자도 String으로 변형하여 넣자.
            BigInteger num3 = new BigInteger(Integer.toString(balls - i));
            num1 = num1.multiply(num3); //곱을 하는 메서드는 multiply
            num1 = num1.divide(num2);        //나눗셈은 divide이다.

        }
        answer = num1.intValue(); // 마지막으로 형변환을 int로 해주었다.
        return answer;
    }
}
