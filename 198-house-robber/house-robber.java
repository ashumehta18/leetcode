class Solution {
    public int rob(int[] nums) {
    int n = nums.length;
    int[] dp = new int[n+1];
    
    if(n == 0) return 0;
    if(n==1) return nums[0];

    dp[0] = nums[0];
    dp[1] = Math.max(nums[0],nums[1]);

    for(int i = 2 ;i<n;i++){
        dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
    }

    return dp[n-1];

    }
}

//find the length
// create dp array
// check for n = 0 =>0
//n==1 => ist index element
// base case first elemnt of dp = first elememt of nums[0];
//..2nd ele max from 1 and 2

//itterate to find dp[i] value 
//return dp[n-1]