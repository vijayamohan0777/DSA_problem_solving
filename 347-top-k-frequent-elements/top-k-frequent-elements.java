class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         int[] ans=new int[k];
        Map<Integer,Integer> mp=new HashMap<>();
         for(int x: nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
         }

         List<Integer> list=new ArrayList<>(mp.keySet());

         list.sort((a,b) -> mp.get(b) - mp.get(a));
         for(int i=0;i<k;i++){
                 ans[i]=list.get(i);
            }
         
         return ans;
    }
    }
