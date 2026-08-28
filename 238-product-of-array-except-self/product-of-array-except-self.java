class Solution {
    public int[] productExceptSelf(int[] nums) {
        //prefix sum;
 
        int[] pl=new int[nums.length];
        int product=1;
        for(int i=0;i<nums.length;i++){
          pl[i]=product;
          product*=nums[i];
        }

       // from reverse
        int[] pr=new int[nums.length];
         product=1;
         for(int i=nums.length-1;i>=0;i--){
            pr[i]=product;
            product*=nums[i];
         }

        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=pl[i]*pr[i];
        }
        // for(int i=0;i<nums.length;i++){
        //     int product=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             product*=nums[j];
        //         }
        //     }
        //     ans[i]=product;
        // }
        return ans;
    }
}