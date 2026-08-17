class Solution {
    int[] dp;

    public int climbStairs(int n) {
        if(dp==null){
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        }

         if (n == 0 || n == 1) {
            dp[n] = 1;
            return dp[n];
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return dp[n];    
    }
}