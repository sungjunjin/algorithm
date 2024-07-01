package me.sj.algorithm.programmers.test;

public class Test1 {
    public static void main(String[] args) {
        String[][] arr = {{"W", "W", "B"}, {"W", "B", "W"}, {"B", "W", "W"}};
        int lonelyBs = solution(arr);
        System.out.println("외로운 'B' 요소 수: " + lonelyBs);
    }

    public static int solution(String[][] arr) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j].equals("B")) {
                    int rowBCnt = 0;
                    int colBCnt = 0;

                    // 같은 행의 "B" 요소 수 세기
                    for (int k = 0; k < arr[0].length; k++) {
                        if (arr[i][k].equals("B")) {
                            rowBCnt++;
                        }
                    }

                    // 같은 열의 "B" 요소 수 세기
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k][j].equals("B")) {
                            colBCnt++;
                        }
                    }

                    // 현재 요소가 외로운 경우 카운트 증가
                    if (rowBCnt == 1 && colBCnt == 1) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
