class Solution {
    public void rotate(int[][] matrix){
        int n = matrix.length;

        for(int i = 0 ;i<n ;i++){
            for(int j =i+1;j<n;j++){
                matrix[i][j] ^= matrix[j][i];
                matrix[j][i] ^=matrix[i][j];
                matrix[i][j] ^= matrix[j][i];
            }
        }

        for(int i = 0 ;i<n ;i++){
            rev(matrix[i],0,n-1);
        }
        
    }
    public void rev(int[] nums, int start , int end){
        while(start<end){
            nums[start] ^= nums[end];
            nums[end] ^= nums[start];
            nums[start] ^= nums[end];
            start++;
            end--;
        }
    }
}

//pattern = rev and swap