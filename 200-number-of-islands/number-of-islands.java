class Solution {
    int islands = 0;

    void bfs(char[][] grid, int[][] directions, Queue<int[]> q) {
              
        while (!q.isEmpty()) {
              
            int[] t = q.poll();
            int x = t[0];
            int y = t[1];
             // grid[x][y] = '0';

            for (int i = 0; i < directions.length; i++) {
                int nx = x + directions[i][0];
                int ny = y + directions[i][1];

                if (nx < 0 || ny < 0 || nx >= grid.length || ny >= grid[0].length || grid[nx][ny] == 0) {
                    continue;
                }

                if (grid[nx][ny] == '1') {
                    q.offer(new int[] { nx, ny });
                    grid[nx][ny] = '0';
                }
            }
        }
        return;
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    grid[i][j]='0';
                    q.offer(new int[] { i, j });
                    bfs(grid, directions, q);
                }
            }
        }

        return islands;
    }
}