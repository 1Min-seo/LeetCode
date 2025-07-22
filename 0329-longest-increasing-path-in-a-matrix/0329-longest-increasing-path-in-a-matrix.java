class Solution {
    private int[] dx = {-1, 0, 0, 1};
    private int[] dy = {0, -1, 1, 0};
    private int m, n;
    private int maxCount;
    //private boolean[][] visited;
    public int longestIncreasingPath(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        maxCount = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                dfs(matrix, new boolean[m][n], i, j, 1);
                //System.out.println("cnt: " + cnt);
                //answer = Math.max(answer, cnt);
            }
        }

        return maxCount;
    }

    private void dfs(int[][] matrix, boolean[][] visited, int x, int y, int count) {
        visited[x][y] = true;
        maxCount = Math.max(maxCount, count);

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx< m && ny < n
            && matrix[x][y] < matrix[nx][ny] && !visited[nx][ny]) {
                dfs(matrix, visited, nx, ny, count + 1);
                visited[nx][ny] = false;
            }   
        }

    }
}