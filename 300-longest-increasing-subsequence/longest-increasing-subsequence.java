class Solution {
    int[][] dp;

    int LIS(int[] nums, int i, int last) {
        if (dp == null) {
            int n = nums.length;
            dp = new int[n + 1][n + 1];
            for (int row = 0; row < dp.length; row++) {
                Arrays.fill(dp[row], -1);
            }
        }

        if (dp[i][last + 1] != -1) {
            return dp[i][last+1];
        }
        if (i == nums.length) {
            return 0;

        }
        int pick = Integer.MIN_VALUE;
        if (last == -1 || nums[i] > nums[last]) {
            pick = LIS(nums, i + 1, i) + 1;
        }
        int notpick = LIS(nums, i + 1, last);

        dp[i][last + 1] = Math.max(pick, notpick);
        return dp[i][last + 1];
    }

    public int lengthOfLIS(int[] nums) {
        return LIS(nums, 0, -1);
    }
}