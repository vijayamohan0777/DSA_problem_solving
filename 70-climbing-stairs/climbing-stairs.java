class Solution {
    int[] dp;

    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return dpstep(n);
    }

    int dpstep(int n) {
        if (n == 0 || n == 1) {
            dp[n] = 1;
            return dp[n];
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = dpstep(n - 1) + dpstep(n - 2);
        return dp[n];
    }
}