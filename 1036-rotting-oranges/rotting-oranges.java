class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int n = grid.length;
        int m = grid[0].length;

        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int minute = 0;
        while (!q.isEmpty() && fresh > 0) {
            minute++;

            int size = q.size();
            int i = 0;
            while (i++ < size) {
                int[] p = q.poll();

                int x = p[0];
                int y = p[1];

                for (int k = 0; k < directions.length; k++) {
                    int rx = x + directions[k][0];
                    int ry = y + directions[k][1];

                    if (rx < 0 || rx >= n || ry < 0 || ry >= m || grid[rx][ry] == 0) {
                        continue;
                    }

                    if (grid[rx][ry] == 1) {
                        grid[rx][ry] = 2;
                        fresh--;
                        q.offer(new int[] { rx, ry });
                    }
                }

            }

        }
        return fresh == 0 ? minute : -1;
    }
}