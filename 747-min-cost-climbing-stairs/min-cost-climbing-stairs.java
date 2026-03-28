class Solution {
    static int dp[];
    public int minCostClimbingStairs(int[] cos) {
        int n = cos.length;
        dp = new int[n+1];
        Arrays.fill(dp,-2);
        int min = Math.min(cost(0,cos),cost(1,cos));
        return min;
    }
    public int cost(int i , int[] nums){
        if(i>=nums.length) return 0;
        if(dp[i] != -2) return dp[i];
        int climb = nums[i] + cost(i+1,nums);
        int c2 = nums[i]+cost(i+2,nums);
        int max = Math.min(climb,c2);
        dp[i] = max;
        return max;
    }
}