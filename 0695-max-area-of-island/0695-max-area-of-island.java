class Solution {
    int rowNum;
    int colNum;
    int currentArea;
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }

        rowNum = grid.length;
        colNum = grid[0].length;
        int maxArea = 0;

        for(int i = 0; i < rowNum; i++) {
            for(int j = 0; j < colNum; j++) {
                if(grid[i][j] == 1) {
                    currentArea = 0;
                    dfs(grid, i, j);
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
        return maxArea;
    }

    private void dfs(int[][] grid, int row, int col) {
        if(row < 0 || col < 0 || row >= rowNum || col >= colNum || grid[row][col] == 0) {
            return;
        }

        grid[row][col] = 0;
        currentArea++;

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}