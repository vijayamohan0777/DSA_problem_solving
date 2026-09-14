class Solution {
    int maxarea = 0;

    void bfs(int[][] grid, int[][] directions, Queue<int[]> q) {
        int area = 1;

        while (!q.isEmpty()) {

            int[] t = q.poll();
            int x = t[0];
            int y = t[1];

            for (int i = 0; i < directions.length; i++) {
                int nx = x + directions[i][0];
                int ny = y + directions[i][1];

                //boundrycheck
                if (nx < 0 || ny < 0 || nx >= grid.length || ny >= grid[0].length || grid[nx][ny] == 0) {
                    continue;
                }

                if (grid[nx][ny] == 1) {
                    area++; //count 1 as area
                    q.offer(new int[] { nx, ny });
                    grid[nx][ny] = 0;
                }
            }
        }
        maxarea = Math.max(maxarea, area);
        return;
    }

    public int maxAreaOfIsland(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        int n = grid.length;
        int m = grid[0].length;

        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new int[] { i, j });
                    grid[i][j] = 0;
                    bfs(grid, directions, q);
                }
            }
        }
        return maxarea;
    }
}