class Solution {

    void solve(int n, int open, int close, String currentbrackets, ArrayList<String> ans) {
        if (currentbrackets.length() == 2 * n) { // if n=2 , 2*2 == 4 == "(())"
            ans.add(currentbrackets);
            return;
        }

        if (open < n) { // important backtrack
            solve(n, open + 1, close, currentbrackets + "(", ans);
        }

        if (open > close) { // important backtrack
            solve(n, open, close + 1, currentbrackets + ")", ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();

        String currentbrackets = "";

        int open = 0;
        int close = 0;

        solve(n, open, close, currentbrackets, ans);
        //solve(n,0,0,"",ans);

        return ans;
    }
}