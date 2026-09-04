class Solution {

    void solve(int i, int n, int sum, List<Integer> temp, List<List<Integer>> ans, int target, int[] candidates) {

        if (sum > target) {
            return;
        }
        if (sum == target) {
            ans.add(new ArrayList<Integer>(temp)); //syntax
            return;
        }
        if (i == n) {
            return;
        }

        if (sum + candidates[i] <= target) { //not check current sum ,check sum with add current element
            temp.add(candidates[i]);
            // for reuse
            solve(i, n, sum + candidates[i], temp, ans, target, candidates);

            temp.remove(temp.size() - 1); // for backtrack important*** remove last recursive element

            //skip
            solve(i + 1, n, sum, temp, ans, target, candidates);
        } else {
            solve(i + 1, n, sum, temp, ans, target, candidates);
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        int sum = 0;
        int n = candidates.length;
        int i = 0;
        List<Integer> temp = new ArrayList<>();
        solve(i, n, sum, temp, ans, target, candidates);

        return ans;
    }
}