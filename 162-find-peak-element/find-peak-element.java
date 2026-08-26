class Solution {
    public int findPeakElement(int[] nums){
       int l=0;
       int r=nums.length-1;
             int ans=0;
          while(l<=r){
            int mid=l+((r-l)>>1);

           if((mid==0 || nums[mid-1] < nums[mid]) && (mid==nums.length-1 || nums[mid+1] <nums[mid])){
                   ans=mid;
                   break;
           }else if(nums[mid+1]>nums[mid]){
            l=mid+1;
           }else{
            r=mid-1;
           }
        }
        return ans;
    }
}