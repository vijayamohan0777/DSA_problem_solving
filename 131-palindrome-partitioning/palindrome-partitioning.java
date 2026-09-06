class Solution {

    boolean ispalindrome(int left,int right,String s){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    void dfs(int index, List<List<String>> ans,List<String> temp,String s){

      if(index == s.length()){
        ans.add(new ArrayList<>(temp));
      }

     // try every substring possible
      for(int end=index;end<s.length();end++){
           if(ispalindrome(index,end,s)){
            //take
               temp.add(s.substring(index,end+1));

            //dfs
            dfs(end+1,ans,temp,s);

            //backtrack
            temp.remove(temp.size()-1);
           }
      }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        int index=0;

        dfs(index,ans,temp,s);

        return ans;
    }
}