class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] ans=new int[m+n];
       
        int l1=0,l2=0;
        int i=0;
        while(l1 <m && l2 <n){
          if(nums1[l1]<nums2[l2]){
            ans[i++]=nums1[l1];
            l1++;
          }else{
            ans[i++]=nums2[l2];
            l2++;
          }
        }

        if(l1==m && l2!=n){
            for(int j=l2;j<n;j++){
                ans[i++]=nums2[j];
            }
        }
         
         
        if(l2==n && l1!=m){
            for(int j=l1;j<m;j++){
                ans[i++]=nums1[j];
            }
        }

        int size=ans.length;
        double median=0;

         if((m+n) %2 ==0){
            median=ans[size >> 1]+ans[(size >> 1 )-1];

            return (double) median/2;
         }else{
            median=ans[size >> 1];
            return (double) median;
         }
    }
}