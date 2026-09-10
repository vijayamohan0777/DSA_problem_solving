class Solution {
    int[] ans=new int[2];
    void firstoccur(int[] nums,int target){
         int l=0;
         int r=nums.length-1;
         while(l<=r){
            int mid=l+((r-l)>>1);
            if(nums[mid] == target){
                ans[0]=mid;
                 r=mid-1;
            }else if(nums[mid] < target){
                l=mid+1;
            }else{
                r=mid-1;
            }
         }
    }

     void lastoccur(int[] nums,int target){
          int l=0;
         int r=nums.length-1;
         while(l<=r){
            int mid=l+((r-l)>>1);
            if(nums[mid] == target){
                ans[1]=mid;
                 l=mid+1;
            }else if(nums[mid] < target){
                l=mid+1;
            }else{
                r=mid-1;
            }
         }
    }
    public int[] searchRange(int[] nums, int target) {


         Arrays.fill(ans,-1);
         firstoccur(nums,target);
         lastoccur(nums,target);

         return ans;
    }
}