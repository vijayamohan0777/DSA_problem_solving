class Solution {
     int perimeter=0;

     void solve(int n, int m,int[] arr,int[][] grid, int[][] directions){
           for(int i=0;i<directions.length;i++){
            int nx= arr[0] + directions[i][0];
            int ny= arr[1] + directions[i][1];

            if(nx<0 || ny<0 || nx >=n || ny>=m || grid[nx][ny]==0){
                perimeter++;
            }

           }
           return ;
     }
    public int islandPerimeter(int[][] grid) {

         int[][] directions={{-1,0},{1,0},{0,1},{0,-1}};

         int n=grid.length;
         int m=grid[0].length;
          int[] arr=new int[2];

         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    arr[0]=i;
                    arr[1]=j;
                    solve(n,m,arr,grid,directions);
                }
            }
         }
         return perimeter;
    }
}