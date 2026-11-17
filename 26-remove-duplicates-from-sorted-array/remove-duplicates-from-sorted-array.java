class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int x: nums){
           set.add(x);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }

        return set.size();
    }
}