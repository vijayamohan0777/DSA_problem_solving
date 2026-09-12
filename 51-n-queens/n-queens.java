class Solution {
    List<List<String>> ans=new ArrayList<>();

     void solve(int n,int rows,boolean[] cols,boolean[] diag1,boolean[] diag2, char[][] board){
        
        if(rows==n){

            List<String> temp=new ArrayList<>();

            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }

            ans.add(temp);

            return ;
        }

        //check all columns

        for(int col=0;col<n;col++){

            int d1=rows-col+(n-1);
            int d2=rows+col;

            if(cols[col] || diag1[d1] || diag2[d2]){
                continue;
            }
               //place Queen
            cols[col]=true;
            diag1[d1]=true;
            diag2[d2]=true;
            
            board[rows][col]='Q';

            //next row
            solve(n,rows+1,cols,diag1,diag2,board);

            //backtrack   --> if not able to place queen in any column
            board[rows][col]='.';
            cols[col]=false;
            diag1[d1]=false;
            diag2[d2]=false;

        }
     }

    public List<List<String>> solveNQueens(int n) {
         
         char[][] board=new char[n][n];
         for(int i=0;i<n;i++){
            Arrays.fill(board[i] , '.');
         }

         boolean[] cols=new boolean[n];
         boolean[] diag1=new boolean[2*n-1];
         boolean[] diag2=new boolean[2*n-1];

          int rows=0;
         solve(n,rows,cols,diag1,diag2,board);

          return ans;
    }
}