class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

        int[] ans=new int[n+m];
      int i=0;
      int j=0;
      int k=0;
        while(i!=n && j!=m){
            if(nums1[i] < nums2[j]){
                ans[k++]=nums1[i];
                i++;
            }else{
                ans[k++]=nums2[j];
                j++;
            } 
        }

        if(i==n){
            while(j!=m){
                ans[k++]=nums2[j];
                j++;
            }
        }

         if(j==m){
            while(i!=n){
                ans[k++]=nums1[i];
                i++;
            }
        }
       int size=ans.length;
        if( (size & 1 ) ==1){
           return ans[size/2] ;
        }else{

        return (ans[size/2]+ans[size/2 -1])/2.0;
        }
    }
}