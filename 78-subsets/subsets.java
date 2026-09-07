class Solution {

    void solve(int i,int[] nums, List<Integer>temp ,List<List<Integer>>ans){
        ans.add(new ArrayList<>(temp));

        if(i==nums.length){
            return;
        }
       
       //take all subsets
       for(int j=i;j<nums.length;j++){
        temp.add(nums[j]);
        //explore
        solve(j+1,nums,temp,ans);
        //backtrack
        temp.remove(temp.size()-1);
       }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int i=0;
        solve(i,nums,temp,ans);

        return ans;
    }
}