class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        //pivot point find
        while(i>= 0 && nums[i]>=nums[i+1]){
            i--;
        }if(i>=0){
            int j = nums.length-1;
            while(nums[j]<= nums[i]){
                j--;
            }swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        
    }
    public void swap(int[] nums,int start,int end){
         nums[start] ^= nums[end];
            nums[end] ^= nums[start];
            nums[start] ^= nums[end];
        
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            nums[start] ^= nums[end];
            nums[end] ^= nums[start];
            nums[start] ^= nums[end];
            start++;
            end--;
        }
    }
}