class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
         dp = new int[n];
        Arrays.fill(dp,-1);
        return loot(0,nums);
    }
    public int loot(int i,int[] nums){
      //  int n = nums.length;
       // int dp[] = new int[n+1];
        if(i>= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = nums[i] + loot(i+2,nums);
        int notp = loot(i+1,nums);
        int max = Math.max(pick,notp);
        dp[i] = max;
        
        return max;

    }
}