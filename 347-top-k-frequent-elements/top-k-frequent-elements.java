class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         int[] ans=new int[k];
        Map<Integer,Integer> mp=new HashMap<>();
         for(int x: nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
         }

         List<Integer> list=new ArrayList<>(mp.keySet());//it only gives the keys to list ==> mp.keySet()

         list.sort((a,b) -> mp.get(b)-mp.get(a));//arrange the elements in descending orde based on frequencies

         //lis.sort((a,b) -> mp.get(a) -mp.get(b));
         //  *arrange the elements in ascending order based on frequencies
         for(int i=0;i<k;i++){
                 ans[i]=list.get(i);
            }
         
         return ans;
    }
    }
