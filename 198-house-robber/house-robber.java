class Solution {
    public int rob(int[] nums) {
        int older=0;
        int oldest=0;
        int current=0;
        for(int i=0;i<nums.length;i++){
             current=Math.max((nums[i]+oldest),older);
            oldest=older;
            older=current;
        }
        return current;
    }
}