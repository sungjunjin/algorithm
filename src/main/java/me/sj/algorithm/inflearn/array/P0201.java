package me.sj.algorithm.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * <p>
 * (첫 번째 수는 무조건 출력한다)
 */
public class P0201 {
    public static void main(String[] args) {
        P0201 p0201 = new P0201();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int x : p0201.solutionMine(arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solutionMine(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                arrayList.add(arr[i]);
            }
        }

        return arrayList;
    }

    public ArrayList<Integer> solutionLecture(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                arrayList.add(arr[i]);
            }
        }

        return arrayList;
    }
}
