class Solution {
    private int m, n;
    private int[] dx = {-1, 0, 0, 1};
    private int[] dy = {0, -1, 1, 0};
    private boolean[][] visited;

    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        int count = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, boolean[][] visited, int x, int y) {
        visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < m && ny < n
            && grid[nx][ny] == '1' && !visited[nx][ny]) {
                dfs(grid, visited, nx, ny);
            }
        }
    }
}