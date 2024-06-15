package me.sj.algorithm.programmers.level0.day11;

public class Day11 {

    // 점의 위치 구하기
    public int solution1(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    // 2차원으로 만들기
    public int[][] solution2(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int partition = num_list.length / n;

        int numListIndex = 0;

        while (numListIndex <= num_list.length - 1) {
            for (int i = 0; i < partition; i++) {
                for (int j = 0; j < n; j++) {
                    answer[i][j] = num_list[numListIndex];
                    numListIndex++;
                }
            }

        }

        return answer;
    }

    // 공 던지기
    public int solution3(int[] numbers, int k) {
        int index = 0;

        for(int i=1;i<k;i++) {
            index = (index + 2) % numbers.length;
        }

        return numbers[index];
    }

    // 배열 회전시키기
    public int[] solution4(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            // 맨앞 맨 뒤 요소 빼고 오른쪽으로 한칸씩 이동
            for (int j = 0; j < numbers.length - 1; j++) {
                answer[j + 1] = numbers[j];
            }

            // 맨 뒤 요소를 맨 앞으로 이동
            answer[0] = numbers[numbers.length - 1];
        } else {
            // 맨앞 맨 뒤 요소 빼고 왼른쪽으로 한칸씩 이동
            for (int j = numbers.length - 1; j > 0; j--) {
                answer[j-1] = numbers[j];
            }

            // 맨 앞 요소를 맨 뒤 이동
            answer[numbers.length - 1] = numbers[0];
        }


        return answer;
    }
}
