class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int x=Math.abs(nums[i]);
            if(nums[n-x] < 0){
                ans.add(x);
            }else{
                nums[n-x]=nums[n-x] * -1;//change as negative
            }
        }
        return ans;
    }
}