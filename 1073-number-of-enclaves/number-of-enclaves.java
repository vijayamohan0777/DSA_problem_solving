class Solution {
    int one=0;
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    one++;
                }
                if((i==0 || j==0 ||i==n-1 ||j==m-1) && (grid[i][j]==1)){
                    q.offer(new int[] {i,j});
                    grid[i][j]=0;
                }
            }
        }

           while(! q.isEmpty()){
            int[] p=q.poll();
              int x=p[0];
              int y=p[1];
              one--;
              
              for(int i=0;i<4;i++){
                int nx=x+direction[i][0];
                int ny=y+direction[i][1];

                if(nx<0 || ny<0 || nx>=n ||ny >=m || grid[nx][ny]==0){
                    continue;
                }
                   q.offer(new int[] {nx,ny});
                   grid[nx][ny]=0;
              }
           }

       return one;
    }
}