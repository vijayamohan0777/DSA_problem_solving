class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=nums.length;

        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid=l+((r-l)>>1);

            if(nums[mid] >= target){
                ans=mid;
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return ans;
    }
}