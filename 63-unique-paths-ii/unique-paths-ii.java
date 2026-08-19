class Solution {
    int[][] dp;

    int solve(int[][] arr, int n, int m) {
        if (dp == null) {
            dp = new int[n + 1][m + 1];
            for (int i = 0; i < dp.length; i++) {
                Arrays.fill(dp[i], -1);
            }
        }
        if (n < 0 || m < 0) {
            return 0;
        }
        if (arr[n][m] == 1) {
            return 0;
        }
        if (n == 0 && m == 0) {
            return 1;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        dp[n][m] = solve(arr, n - 1, m) + solve(arr, n, m - 1);
        return dp[n][m];
    }

    public int uniquePathsWithObstacles(int[][] og) {
        int n = og.length;
        int m = og[0].length;
        return solve(og, n - 1, m - 1);
    }
}