class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new  HashSet<>();

        for(int x: nums){
            set.add(x);
        }
        int i=1;
        int ans=0;
        while(i*k >=0){
            if(!set.contains(i*k)){
                ans=i*k;
                break;
            }
            i++;
        }
        return ans;
    }
}