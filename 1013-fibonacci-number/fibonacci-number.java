class Solution {
    int[] dp;

    public int fib(int n) {
        if (dp == null) {
            dp = new int[n + 1];
            Arrays.fill(dp, -1);
        }
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fib(n - 1) + fib(n - 2);
        return dp[n];
    }
}