package me.sj.algorithm.programmers.test;

import java.util.LinkedList;

public class Test3 {
    static int[] dy = {1, 0, -1, 0}; // 상, 하, 좌, 우 방향
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) {
        Test3 test1 = new Test3();
        int[][] grid = {{1, 1, 0, 0}, {1,1,0,0}, {0,0,0,1}, {0,0,1,1}};

        int solution = test1.solution(grid);
        System.out.println(solution);
    }

    public int solution(int[][] grid) {
        boolean[][] check = new boolean[grid.length][grid[0].length];
        int maxArea = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (!check[row][col] && grid[row][col] == 1) {
                    maxArea = Math.max(maxArea, bfs(grid, check, row, col));
                }
            }
        }

        return maxArea;
    }

    private int bfs(int[][] grid, boolean[][] visited, int row, int col) {
        LinkedList<int[]> queue = new LinkedList<>();
        int area = 0;

        queue.add(new int[]{row, col});
        visited[row][col] = true;
        area++;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dy[i];
                int nc = c + dx[i];

                if (nr < 0 || nr >= grid.length || nc < 0 || nc >= grid[0].length || visited[nr][nc] || grid[nr][nc] == 0) {
                    continue;
                }

                queue.add(new int[]{nr, nc});
                visited[nr][nc] = true;
                area++;
            }
        }

        return area;
    }
}
