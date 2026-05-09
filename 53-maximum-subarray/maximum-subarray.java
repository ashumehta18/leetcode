class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = nums[0];
        int maxSo = nums[0];
        for(int i = 1 ;i<nums.length;i++){
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSo = Math.max(currMax,maxSo);
          
        }
          

        return maxSo;
    }
}