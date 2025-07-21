import java.util.*;
class Solution {
    int m;
    int n;
    boolean[][] visited;
    int[] dx = {-1, 0, 0, 1};
    int[] dy = {0, -1, 1, 0};
    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];

        Queue<int[]> queue = new LinkedList<>();

        //위쪽, 아래쪽
        for(int i = 0; i < n; i++) {
            if(board[0][i] == 'O') {
                queue.offer(new int[]{0, i});
                visited[0][i] = true;
            }
            if(board[m - 1][i] == 'O') {
                queue.offer(new int[]{m - 1, i});
                visited[m - 1][i] = true;
            }
        }

        //왼쪽, 오른쪽
        for(int i = 0; i < m; i++) {
            if(board[i][0] == 'O') {
                queue.offer(new int[]{i, 0});
                visited[i][0] = true;
            }

            if(board[i][n - 1] == 'O') {
                queue.offer(new int[]{i, n - 1});
                visited[i][n - 1] = true;
            }
        }

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < m && ny < n && 
                    !visited[nx][ny] && board[nx][ny] == 'O') {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(!visited[i][j] && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

    }
}
