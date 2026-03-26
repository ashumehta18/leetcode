class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
       // int m = matrix[0].length;

        for(int i = 0 ;i<n ;i++){
            for(int j = i+1 ;j<n ;j++){
               matrix[i][j] ^= matrix[j][i];
                matrix[j][i] ^= matrix[i][j];
                 matrix[i][j] ^= matrix[j][i];
            }

        }

        for(int i = 0 ;i<n ;i++){
            reverse(matrix[i],0,n-1);
        }
    }

    public void reverse(int nums[],int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public void swap(int[] nums, int start,int end){
        nums[start] ^=nums[end];
        nums[end] ^=nums[start];
        nums[start] ^=nums[end];
    }
}