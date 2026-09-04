class Solution {

    void solve(String digits,int index,String currentletters,ArrayList<String> combinations,String[] map){
          if(index == digits.length()){
            combinations.add(currentletters);
            return;
          }

          String letters=map[digits.charAt(index) - '0'];


          for(int i=0;i<letters.length();i++){
            solve(digits,index+1,currentletters+letters.charAt(i),combinations,map);
          }
    }
    public List<String> letterCombinations(String digits) {
        String[] map = { "", "", "abc", "def",
                "ghi", "jkl", "mno",
                "pqrs", "tuv", "wxyz" };

                ArrayList<String> combinations=new ArrayList<>();

                String currentletters="";
                int index=0;

                solve(digits,index,currentletters,combinations,map);

                return combinations;
    }
}