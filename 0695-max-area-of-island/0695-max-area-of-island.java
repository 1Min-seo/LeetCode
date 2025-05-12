class Solution {
    private final int[] dx = {-1, 0, 0, 1};
    private final int[] dy = {0, -1, 1, 0};
    private int row;
    private int col;

    public int maxAreaOfIsland(int[][] grid) {
        int answer = 0;
        row = grid.length;
        col = grid[0].length;

        if(grid == null || grid.length == 0) return 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == 1){
                    int area = dfs(grid, i, j);
                    answer = Math.max(answer, area);
                }  
            }
        }
        return answer;
    }

    private int dfs(int[][] grid, int x, int y) {
        grid[x][y] = 0;
        int area = 1;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >=0 && nx < row && ny < col && grid[nx][ny] == 1) {
                area += dfs(grid, nx, ny);
            }
        }
        return area;
    }

}
// 1 1 0 0 0
// 1 1 0 0 0
// 0 0 0 1 1
// 0 0 0 1 1