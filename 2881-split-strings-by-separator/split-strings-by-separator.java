class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans=new LinkedList<>();
         String st=String.valueOf(separator);
        for(String y: words){
            String[] s=y.split("\\"+st);
          for( String x: s){
            if(! x.isEmpty()){
            ans.add(x);
            }
          }
        }
        return ans;
    }
}