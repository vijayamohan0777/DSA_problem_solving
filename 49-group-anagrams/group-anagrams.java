class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();

      Map<String,List<String>> map=new HashMap<>();

        for(String x:strs){
           char[] str=x.toCharArray();
           Arrays.sort(str);
           String key=new String(str);

           if(map.containsKey(key)){
            map.get(key).add(x);
           }else{
            map.put(key,new ArrayList<>());
            map.get(key).add(x);
           }
        }
          for(String s:map.keySet()){
              ans.add(map.get(s));
          }

        return ans;
    }
}