class Solution {

   // KADANE'S Algorithm
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int gs=nums[0];

        for(int i=1;i<nums.length;i++){
              cs=Math.max(cs+nums[i],nums[i]);
              gs=Math.max(cs,gs);
        }    
        return gs;
        }
}