class Solution {
    int count=0;
    void TS(int[] nums, int sum,int i,int target){
         if(i==nums.length){
            if(sum==target){
                count++;
            }
            return;
         }
         //pick sum+nums[i];
         TS(nums,sum+nums[i],i+1,target);

         //not pick sum-nums[i]
         TS(nums,sum-nums[i],i+1,target);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        int i=0;
          TS(nums,sum,i,target);
          return count;
    }
}