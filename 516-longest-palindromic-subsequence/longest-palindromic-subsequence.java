class Solution { 

        int[][]dp;

     int lps(String s1, String s2, int i, int j) {
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
            dp[i][j] = 1 + lps(s1, s2, i - 1, j - 1);
        } else {

            dp[i][j] = Math.max(lps(s1, s2, i - 1, j), lps(s1, s2, i, j - 1));
        }
        return dp[i][j];
    }

    public int longestPalindromeSubseq(String s) {
        String sr;
        StringBuilder sb=new StringBuilder(s);
        sr=sb.reverse().toString();
        int i=s.length();
        int j=sr.length();
        return lps(s,sr,i-1,j-1);
    }
}