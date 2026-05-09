class Solution {
    public void setZeroes(int[][] matrix) {
        // calculate length of row column
        // check row and col = 0 and set values as 0
        // using loop from 1 to n if ij = 0 then set i =0 and j = 0

        int n = matrix.length;
        int m = matrix[0].length;
        boolean row = false;
        boolean col = false;

        for(int i = 0 ;i<n;i++) if(matrix[i][0] == 0) row = true;
        for(int j = 0 ;j<m ;j++) if(matrix[0][j] == 0) col = true;

        for(int i = 1;i<n;i++){
            for(int j = 1 ;j<m ;j++){
               if(matrix[i][j] == 0){
                matrix[i][0] = 0 ;
                matrix[0][j] = 0;

               }
            }
        }

        for(int i = 1 ;i<n;i++){
            for(int j = 1 ;j<m ;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }



        if(row) for(int i = 0 ;i<n ;i++) matrix[i][0] = 0;
        if(col) for(int j=0 ; j<m ;j++) matrix[0][j] = 0;
    }
}