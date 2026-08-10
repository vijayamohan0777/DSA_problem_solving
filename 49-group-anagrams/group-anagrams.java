class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> mp =new HashMap<>(); 

       for(String x: strs){
         char[] str=x.toCharArray();
           Arrays.sort(str);
           String key=new String(str);

           if(mp.containsKey(key)){
             mp.get(key).add(x);
           }else{
            mp.put(key,new ArrayList<>());
            mp.get(key).add(x);
           }
       }
       List<List<String>>ans =new ArrayList<>();
       for(String x :mp.keySet()){
        ans.add(mp.get(x));
       }

       return ans;
    }
}