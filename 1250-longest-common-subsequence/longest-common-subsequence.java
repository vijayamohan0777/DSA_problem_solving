class Solution {
    int dp[][];

    int lcs(String s1, String s2, int i, int j) {
        if (dp == null) {
            dp = new int[i + 1][j + 1];
            for (int k = 0; k <= i; k++) {
                Arrays.fill(dp[k], -1);
            }
        }
            if (i < 0 || j < 0) {
                return 0;
            }
            if (dp[i][j] != -1) {
                return dp[i][j];
            }
        

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + lcs(s1, s2, i - 1, j - 1);
        } else {

            dp[i][j] = Math.max(lcs(s1, s2, i - 1, j), lcs(s1, s2, i, j - 1));
        }
        return dp[i][j];
    }

    public int longestCommonSubsequence(String s1, String s2) {
        int i = s1.length();
        int j = s2.length();
        return lcs(s1, s2, i - 1, j - 1);
    }
}