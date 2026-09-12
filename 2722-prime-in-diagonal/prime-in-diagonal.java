class Solution {
    boolean isprime(int n){
        if(n<=1){
            return false;
        }
         if(n==2){
            return true;
         }
        if(n%2 == 0){
            return false;
        }

        for(int i=3;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;

        int maxprime=0;

        for(int i=0;i<n;i++){
            if(isprime(nums[i][i])){
                maxprime=Math.max(maxprime,nums[i][i]);
            }

            if(isprime(nums[i][n-i-1])){
                maxprime=Math.max(maxprime,nums[i][n-i-1]);
            }
        }

        return maxprime;
    }
}