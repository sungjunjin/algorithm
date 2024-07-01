package me.sj.algorithm.programmers.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다. 산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며, 명령은 다음과 같은 형식으로 주어집니다.
 *
 * ["방향 거리", "방향 거리" … ]
 * 예를 들어 "E 5"는 로봇 강아지가 현재 위치에서 동쪽으로 5칸 이동했다는 의미입니다. 로봇 강아지는 명령을 수행하기 전에 다음 두 가지를 먼저 확인합니다.
 *
 * 주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
 * 주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
 * 위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.
 * 공원의 가로 길이가 W, 세로 길이가 H라고 할 때, 공원의 좌측 상단의 좌표는 (0, 0), 우측 하단의 좌표는 (H - 1, W - 1) 입니다.
 */
public class C16565 {
    public static void main(String[] args) {
        C16565 p1003 = new C16565();
        long n = 12345;

        String[] park = new String[]{"SOO", "OOO", "OOO"};
        String[] routes = new String[]{"E 2", "S 2", "W 1"};

        p1003.solution(park, routes);

    }

    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        int parkWidth = park[0].length();
        int parkHeight = park.length;

        char[][] board = new char[parkHeight][parkWidth];

        for (int i = 0; i < parkHeight; i++) {
            for (int j = 0; j < parkWidth; j++) {
                board[i][j] = park[i].charAt(j);

                if (board[i][j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        int[] dh = {-1, 0, 1, 0};
        int[] dw = {0, 1, 0, -1};

        Map<Character, Integer> directionMap = new HashMap<>();
        directionMap.put('N', 0);
        directionMap.put('E', 1);
        directionMap.put('S', 2);
        directionMap.put('W', 3);

        for (int i = 0; i < routes.length; i++) {
            int moveCnt = Integer.parseInt(routes[i].substring(2));
            int direction = directionMap.get(routes[i].charAt(0));

            boolean check = true;

            int heightIdx = answer[0];
            int widthIdx = answer[1];

            for (int j = 0; j < moveCnt; j++) {
                heightIdx += dh[direction];
                widthIdx += dw[direction];

                // 범위 밖
                if (heightIdx >= parkHeight || heightIdx < 0 || widthIdx >= parkWidth || widthIdx < 0) {
                    check = false;
                    break;
                }
                // 장애물
                if (board[heightIdx][widthIdx] == 'X') {
                    check = false;
                    break;
                }
            }

            if (check) {
                answer[0] = heightIdx;
                answer[1] = widthIdx;
            }
        }

        return answer;
    }
}
