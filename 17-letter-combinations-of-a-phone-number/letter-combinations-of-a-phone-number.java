class Solution {
    void solve(int index, String currentstr, List<String> ans, String digits, String[] map) {
        if (index == digits.length()) {
            ans.add(currentstr);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            currentstr += letters.charAt(i);
            solve(index + 1, currentstr, ans, digits, map);
            currentstr=currentstr.substring(0,currentstr.length()-1);

            //or

          //  solve(index+1,currentstr+letters.charAt(i),ans,digits,map);
        }
    }

    public List<String> letterCombinations(String digits) {
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> ans = new ArrayList<>();

        String currentstr = "";
        int size = 0;

        solve(size, currentstr, ans, digits, map);

        return ans;
    }
}