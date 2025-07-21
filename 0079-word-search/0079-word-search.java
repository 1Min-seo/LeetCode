class Solution {
    private int[] dx = {-1, 0, 0, 1};
    private int[] dy = {0, -1, 1, 0};
    private int m, n;
    private boolean[][] visited;
    boolean found = false;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];
       

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == word.charAt(0)) {
                    dfs(board, visited, i, j, 0, word);
                    if(found) return true;
                }
            }
        }
        return false;
    }

    private void dfs(char[][] board, boolean[][] visted, int x, int y, int index, String word) {
        if(board[x][y] == word.charAt(index) && index == word.length() - 1) {
            found = true;
            return;
        }
         visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < m && ny < n 
            && !visited[nx][ny] && board[nx][ny] == word.charAt(index + 1)) {
                dfs(board, visited, nx, ny, index + 1, word);
            }
        }
        visited[x][y] = false;
    }
}