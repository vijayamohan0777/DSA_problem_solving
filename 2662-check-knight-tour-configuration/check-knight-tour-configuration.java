class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0) {
            return false;
        }

        int[][] positionmatx = new int[n * n][2];
        //like 0:{0,0}  ,1:{2,1},... etc...  position index of each element;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = grid[i][j];
                positionmatx[x][0] = i;
                positionmatx[x][1] = j;
            }
        }

        for (int i = 0; i < n * n - 1; i++) {
            int cr = positionmatx[i][0];//current row
            int cc = positionmatx[i][1];//current column

            int nr = positionmatx[i + 1][0];//next element row
            int nc = positionmatx[i + 1][1];//next element column

            int validrow = Math.abs(nr - cr);//1 or 2
            int validcol = Math.abs(nc - cc);//1 or 2

            if (!(validrow == 2 && validcol == 1) && !(validrow == 1 && validcol == 2)) {
                return false;
            }
        }
        return true;
    }
}