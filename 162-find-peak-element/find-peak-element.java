class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int n = nums.length;
        
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                return i;
            }
            if(nums[0]>nums[1]){
                return 0;
            }
            if(nums[n-2]<nums[n-1]){
                return n-1;
            }
        }
        for(int i = 1;i<nums.length;i++){
            if(nums.length == 2 && nums[i-1]>nums[i]) {
                return 0;
            }else{
                return 1;
            }
        }
        return -1;
    }
}