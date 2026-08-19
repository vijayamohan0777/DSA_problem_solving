class Solution {
     int[] dp;

    int maxsum(int[] arr,int n){
     if (dp==null){
        dp=new int[n+1];
        Arrays.fill(dp,-1);
     }
        if(n<=0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        int take=arr[n-1]+maxsum(arr,n-2);
        int skip=maxsum(arr,n-1);

         dp[n]= Math.max(take,skip);
         return dp[n];
    }
    public int rob(int[] nums) {
    //     int n=nums.length;
    //      dp=new int[n+1];
    //      dp[0]=0;
    //      dp[1]=nums[0];
    //      for(int i=2;i<=n;i++){
    //          dp[i]=Math.max(nums[i-1]+dp[i-2] ,dp[i-1]);
    //      }
             
    //  return dp[n];

        // int older=0;
        // int oldest=0;
        // int current=0;
        // for(int i=0;i<nums.length;i++){
        //      current=Math.max((nums[i]+oldest),older);
        //     oldest=older;
        //     older=current;
        // }
        // return current;
        int n=nums.length;
         return maxsum(nums, n);

    }
}