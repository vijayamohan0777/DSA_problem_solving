class Solution {

    void solve(int i, int n, int sum, List<Integer> temp, List<List<Integer>> ans, int target, int[] candidates) {

        if (sum > target) {
            return;
        }

        if (sum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (i == n) {
            return;
        }

        if (sum + candidates[i] <= target) {
            //take as reuse
            temp.add(candidates[i]);
            solve(i, n, sum + candidates[i], temp, ans, target, candidates);

            //take as skip
            temp.remove(temp.size() - 1);
            solve(i + 1, n, sum, temp, ans, target, candidates);
        } else {
            solve(i + 1, n, sum, temp, ans, target, candidates);
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        int sum = 0;
        int i = 0;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        solve(i, n, sum, temp, ans, target, candidates);

        return ans;
    }
}