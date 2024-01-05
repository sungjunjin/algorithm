package me.sj.algorithm.day7;

import java.util.Scanner;

public class Day7 {
    public String reverseString(String my_string) {
        char[] myCharArray = my_string.toCharArray();

        char[] answerArray = new char[myCharArray.length];

        for(int i=0;i<myCharArray.length;i++) {
            answerArray[i] = myCharArray[(myCharArray.length - 1) - i];
        }

        // StringBuilder -> reverse로도 가능
        // StringBuilder sb = new StringBuilder(my_string);
        // return sb.reverse().toString();
        return String.valueOf(answerArray);
    }

    public void printTriangle(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public int[] countEventOdd(int[] num_list) {
        int[] answer = new int[2];

        int oddCount = 0;
        int eventCount =0;

        for(int i=0;i<num_list.length;i++) {
            if(num_list[i] % 2 ==0) {
                eventCount++;
            } else {
                oddCount++;
            }
        }

        answer[0] = eventCount;
        answer[1] = oddCount;

        return answer;
    }

    public String printChar(String my_string, int n) {
        char[] charArray = my_string.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(char c: charArray) {
            for(int i=0;i<n;i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}
