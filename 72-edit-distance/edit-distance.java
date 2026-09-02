class Solution {

    int minop(int i, int j, String s1, String s2, int[][] dp) {
        if (i < 0) {
            return j + 1; //if s1 is empty ""  insert all char of s2
        }
        if (j < 0) {
            return i + 1; // if s2 is empty ""  delete all char of s1
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int minways = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            minways = minop(i - 1, j - 1, s1, s2, dp);
        } else {
            int replace = 1 + minop(i - 1, j - 1, s1, s2, dp);// add operations

            int insert = 1 + minop(i, j - 1, s1, s2, dp);
            int delete = 1 + minop(i - 1, j, s1, s2, dp);

            minways = Math.min(replace, Math.min(insert, delete));
        }
        dp[i][j] = minways;

        return dp[i][j];// return minways;
    }

    public int minDistance(String word1, String word2) {
        int i = word1.length();
        int j = word2.length();
        int[][] dp = new int[i][j];

        for (int k = 0; k < i; k++) {
            Arrays.fill(dp[k], -1);
        }

        return minop(i - 1, j - 1, word1, word2, dp);
    }
}