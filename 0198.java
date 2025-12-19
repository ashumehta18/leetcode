https://leetcode.com/problems/house-robber/submissions/1859733059/


class Solution {

    int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);

        return solve(0, nums);
    }

    private int solve(int i, int[] nums) {
       
        if (i >= nums.length)
            return 0;

   
        if (dp[i] != -1)
            return dp[i];

        
        dp[i] = Math.max(
                nums[i] + solve(i + 2, nums), // rob
                solve(i + 1, nums)             // skip
        );

        return dp[i];
    }
}
