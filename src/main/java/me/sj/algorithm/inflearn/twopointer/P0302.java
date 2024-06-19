package me.sj.algorithm.inflearn.twopointer;

import java.util.*;

/**
 * 공통원소 구하기
 */
public class P0302 {
    public static void main(String[] args) {
        P0302 p0302 = new P0302();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int n2 = in.nextInt();

        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }

        ArrayList<Integer> answer = p0302.solutionLecture(arr, arr2);

        for(int i: answer) {
            System.out.print(i + " ");
        }

    }

    public ArrayList<Integer> solutionMine(int[] arr, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for(int a : arr) {
            if(map.containsKey(a)) {
                map.put(a , map.get(a) + 1);
            } else {
                map.put(a , 1);
            }

        }

        for(int a : arr2) {
            if(map.containsKey(a)) {
                map.put(a , map.get(a) + 1);
            } else {
                map.put(a , 1);
            }
        }

        for(Map.Entry<Integer, Integer> set : map.entrySet()) {
            if(set.getValue() != 1) {
                answer.add(set.getKey());
            }
        }

        return answer;
    }

    public ArrayList<Integer> solutionLecture(int[] arr, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1=0;
        int p2=0;

        Arrays.sort(arr);
        Arrays.sort(arr2);

        while(p1 < arr.length && p2 < arr2.length) {
            if(arr[p1] < arr2[p2]) {
                p1++;
            } else if (arr[p1] == arr2[p2]) {
                answer.add(arr[p1]);
                p1++;
                p2++;
            }
            else {
                p2++;
            }
        }


        return answer;
    }
}
