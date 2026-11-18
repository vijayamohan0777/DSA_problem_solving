class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-1;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                int cursum=nums[i]+nums[l]+nums[r];
                if(Math.abs(cursum-target) < Math.abs(closet-target)){
                    closet=cursum;
                }
                if(cursum == target){
                    return cursum;
                }else if(cursum <target){
                    l++;
                }else{
                    r--;
                }
            }
        }
           return closet;
    }
}