class Solution {

    boolean dfs(int index,char[][]board,String word ,int i,int j,int m,int n){

       //boundry check
       if(i<0 || j<0 || i>=m || j>=n){
        return false;
       }
       
       //if is notsame
       if(word.charAt(index) != board[i][j]){
          return false;
       }
       
        //if all word is searched
       if(index == word.length()-1){
          return true;
       }

       //take
       char temp=board[i][j];
       board[i][j]='$';

       boolean found=dfs(index+1,board,word,i-1,j,m,n)||dfs(index+1,board,word,i+1,j,m,n)||dfs(index+1,board,word,i,j-1,m,n)||dfs(index+1,board,word,i,j+1,m,n);
      
      // backtrack
      board[i][j]=temp;

       return found;

    }   

    public boolean exist(char[][] board, String word) {
        int index=0;
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(index,board,word,i,j,m,n)){
                    return true;
                }
            }
        }
     return false;   
    }
}