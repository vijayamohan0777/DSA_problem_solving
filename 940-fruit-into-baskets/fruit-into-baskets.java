class Solution {
    public int totalFruit(int[] fruits) {
         Map<Integer,Integer> map=new HashMap<>();

         int left=0;
         int maxfruit=0;

         for(int r=0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
               left++; 
            }
                 maxfruit=Math.max(maxfruit,r-left+1);
         }
         return maxfruit;
    }
}