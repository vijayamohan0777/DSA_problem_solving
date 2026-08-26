class Solution {
    boolean check(int[] weights,int n,int mid, int days){
           int sum=0;
           int day=1;
           for(int i=0;i<n;i++){
              sum+=weights[i];

              if(sum > mid){
                 sum=weights[i];
                 day++;
              }
           }
           return day<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE;
        int h=0;
        for(int i=0;i<weights.length;i++){
            h+=weights[i];
            l=Math.max(l,weights[i]);
        }
        int ans=0;
        int n=weights.length;
        while(l<=h){
            int mid=l+((h-l)>>1);

            if(check( weights,n,mid,days)){
                 ans=mid;
                 h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}