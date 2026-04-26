class Solution {
    // public int lengthOfLIS(int[] nums) {
    //     int start = 0;
    //     int end = nums.length;
    //     int[] ans = new int[];

    //     ans[0] = nums[0];

    //     for(int i = 1;i<end;i++){
    //         if(nums[i]>nums[0]){
    //             //add element at last position of ans array
    //         }
    //         else if(nums[i]<nums[0]){
    //             //add element at start
    //         }else{
    //             //if in btw lies then using lower bound add kro 
    //         }

    //     }
    //     return ans.length;
    // }

    public int lengthOfLIS(int[] nums) {
    if (nums == null || nums.length == 0) return 0;

    int[] ans = new int[nums.length];
    int size = 0; // Tracks the current length of the LIS found so far

    for (int x : nums) {
        int i = 0, j = size;
        
        // Binary Search to find the lower bound (insertion point)
        while (i != j) {
            int mid = (i + j) / 2;
            if (ans[mid] < x)
                i = mid + 1;
            else
                j = mid;
        }
        
        ans[i] = x; // Replace or extend
        if (i == size) size++; // If we added to the end, increase size
    }
    
    return size;
}
}