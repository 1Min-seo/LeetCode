import java.util.*;
class Solution {
    int m;
    int n;
    int[] dx = {-1, 0, 0, 1};
    int[] dy = {0, -1, 1, 0};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacificReachable = new boolean[m][n];
        boolean[][] atlanticReachable = new boolean[m][n];

        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();

        for(int i = 0; i < m; i++) {
            pacificQueue.offer(new int[]{i, 0});
            pacificReachable[i][0] = true;
        }

        for(int i = 0; i < n; i++) {
            pacificQueue.offer(new int[]{0, i});
            pacificReachable[0][i] = true;
        }

        for(int i = 0; i < m; i++) {
            atlanticQueue.offer(new int[]{i, n - 1});
            atlanticReachable[i][n - 1] = true;
        }

        for(int i = 0; i < n; i++) {
            atlanticQueue.offer(new int[]{m - 1, i});
            atlanticReachable[m - 1][i] = true;
        }

        bfs(heights, pacificQueue, pacificReachable);
        bfs(heights, atlanticQueue, atlanticReachable);

        List<List<Integer>> results = new ArrayList<>();

        for(int r = 0; r < m; r++) {
            for(int c = 0; c < n; c++) {
                if(pacificReachable[r][c] && atlanticReachable[r][c]) {
                    List<Integer> coord = new ArrayList<>();
                    coord.add(r);
                    coord.add(c);
                    results.add(coord);
                }
            }
        }
        return results;
    }

    private void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited) {
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            for(int i = 0; i < 4; i++) {
                int nx = r + dx[i];
                int ny = c + dy[i];

                if(nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && heights[nx][ny] >= heights[r][c]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }

        }
    }
}