class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(String x: strs){
            char[] arr=x.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);

            if(map.containsKey(key)){
                map.get(key).add(x);
            }else{
                map.put(key,new ArrayList<>());
                map.get(key).add(x);
            }
        }

        List<List<String>> ans=new ArrayList<>();
        for(String k : map.keySet()){
            ans.add(map.get(k));
 
        }
        return ans;
    }
}