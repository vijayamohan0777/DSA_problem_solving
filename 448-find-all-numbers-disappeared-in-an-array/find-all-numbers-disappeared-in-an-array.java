class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Set<Integer> set=new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        // for(int x:nums){
        //     set.add(x);
        // }

        // for(int i=1;i<=nums.length;i++){
        //     if(!set.contains(i)){
        //         ans.add(i);
        //     }
        // }
        int n = nums.length;


       // same logic as 442 problem
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);

            if (nums[n - x] < 0) {
                continue;
            } else {
                nums[n - x] = nums[n - x] * -1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans.add(n - i);
            }
        }

        return ans;
    }
}