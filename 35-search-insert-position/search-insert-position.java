class Solution {
    public int searchInsert(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){    
        //     if(nums[i]>=target){
        //         return i;
        //     }
        // }
        // return nums.length;

        int ans=nums.length;
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+((r-l)>>1);

            if(nums[mid]>=target){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}