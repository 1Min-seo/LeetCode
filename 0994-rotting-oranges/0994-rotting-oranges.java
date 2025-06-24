import java.util.*;

class Solution {
    int rowNum;
    int colNum;
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        rowNum = grid.length;
        colNum = grid[0].length;

        Queue<int[]> queue = new ArrayDeque<>();
        int freshOranges = 0;
        int minutes = 0;

        for(int i = 0; i < rowNum; i++) {
            for(int j = 0; j < colNum; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        if(freshOranges == 0) return 0;

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            boolean isRotThisMin = false;

            for(int i = 0; i < levelSize; i++) {
                int[] rotten = queue.poll();
                int r = rotten[0];
                int c = rotten[1];

                int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
                for(int[] dir : directions) {
                    int nx = r + dir[0];
                    int ny = c + dir[1];

                    if(nx >= 0 && ny >= 0 && nx < rowNum && ny < colNum && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        queue.offer(new int[]{nx, ny});
                        freshOranges--;
                        isRotThisMin = true;
                    }
                }
            }

            if(isRotThisMin) {
                minutes++;
            }
        }

        if(freshOranges > 0) return -1;
        else return minutes;
    }
}