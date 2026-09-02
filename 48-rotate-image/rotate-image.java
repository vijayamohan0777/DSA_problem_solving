class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //Transpose the matrix

        //by swap the  upper diagnol elements of matrix with lower diagnol element
        // if i can use extra space like temp[][]
        // temp[i][j]  = matrix[j][i];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {  //j=i+1   is important for upper diagnol transpose
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse the each row of  transposed matrix

        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}