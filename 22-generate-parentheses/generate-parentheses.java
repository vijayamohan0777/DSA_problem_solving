class Solution {
    void solve(int n,List<String> ans,String current,int open,int close){
            if(current.length() == 2*n){
                ans.add(current);
                return;
            }
         
          if(open<n){
            solve(n,ans,current+"(",open+1,close);
          }

          if(close<open){
            solve(n,ans,current+")",open,close+1);
          }

    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        String current="";
        int open=0,close=0;
        solve(n, ans,current,open,close);
        
        return ans;
    }
}