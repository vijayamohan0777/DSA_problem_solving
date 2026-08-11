class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer>st=new HashSet<>();
        for(int x: nums){
            st.add(x);
        }

        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }

        int ans=sum;
        while(st.contains(ans)){
            ans++;
        }
        return ans;
    }
}