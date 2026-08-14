class Solution {
    boolean Check(int[] nums,int mid,int n,int k){
        int subarr=1;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum > mid){
                subarr++;
                sum=nums[i];
            }
        }
        return subarr<=k;
    }
    public int splitArray(int[] nums, int k) {
        int  n=nums.length;
        int low=nums[0],high=0;
        int ans=0;

         for(int x : nums){
            high+=x;
            if(x>low){
                low=x;
            }
         }

        while(low<=high){
            int mid=low+((high-low)>>1);

            if(Check(nums,mid,n,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }
}