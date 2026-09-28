class Solution {
    int fresh=0;
    int minutes=0;

    void bfs(int[][] grid,int[][] directions, Queue<int[]> q){
        while(! q.isEmpty() && fresh>0){
            int size=q.size();
            minutes++;
            int i=0;
            while(i++ < size){
                int[] temp=q.poll();
                int x=temp[0];
                int y=temp[1];
                for(int j=0;j<directions.length;j++){
                    int nx=x+directions[j][0];
                    int ny=y+directions[j][1];

                    if(nx<0 || ny<0 || nx >=grid.length || ny >=grid[0].length || grid[nx][ny]==0){
                       continue;
                    }

                    if(grid[nx][ny]==1){
                        fresh--;
                        grid[nx][ny]=2;
                       q.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        bfs(grid,directions,q);

        return fresh==0 ? minutes:-1;
    }
}