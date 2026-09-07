class Solution {

    void solve(List<List<Integer>> ans, boolean[] used, int[] nums, List<Integer> temp) {
         if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
         }

         for(int i=0;i<nums.length;i++){
            //neglect if already used
            if(used[i]==true){
                continue;
            }
            //take
            used[i]=true;
            temp.add(nums[i]);
            //explore
            solve(ans,used,nums,temp);

            //backtrack
            used[i]=false;
            temp.remove(temp.size()-1);
         }
      
    }

    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> temp=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
      
      solve(ans,used,nums,temp);

      return ans;
    }
}