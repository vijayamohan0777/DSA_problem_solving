class Solution {

    void solve(List<List<Integer>> ans, boolean[] used, int[] nums, List<Integer> temp) {

        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            //choose the element
            temp.add(nums[i]);
            used[i] = true;

            //explore other element
            solve(ans, used, nums, temp);

            //undo and backtrack
            temp.remove(temp.size() - 1);

            used[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        solve(ans, used, nums, temp);

        return ans;
    }
}