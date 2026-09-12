class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int x:nums){
            set.add(x);
        }

        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}