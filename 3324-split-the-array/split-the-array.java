class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
       
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x) > 2){
                return false;
            }
        }
        return true;
    }
}