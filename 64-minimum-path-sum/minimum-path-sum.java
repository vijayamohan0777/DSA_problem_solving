class Solution {
    int[][] dp;

    int minpath(int[][] mat, int n, int m) {
        if (dp == null) {
            dp = new int[n + 1][m + 1];
            for (int i = 0; i <=n; i++) {
                Arrays.fill(dp[i], -1);
            }
        }

        if (n == 0 && m == 0) {
            return mat[0][0];
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (n == 0) {
            dp[n][m] = mat[n][m] + minpath(mat, n, m - 1);
            return dp[n][m];
        }
        if (m == 0) {
            dp[n][m] = mat[n][m] + minpath(mat, n - 1, m);
            return dp[n][m];
        }

        dp[n][m] = mat[n][m] + Math.min(minpath(mat, n - 1, m), minpath(mat, n, m-1));
        return dp[n][m];
    }

    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        return minpath(grid, n - 1, m - 1);

    }
}