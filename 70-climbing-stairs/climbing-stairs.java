class Solution {
    public int climbStairs(int n) {
        int[] dp = new int [n+1];
       // int ans = 0;
        if(n<=2) return n;
        dp[1] =1;
        dp[2] =2;
        for(int i = 3 ;i<=n;i++){
           //if(dp[i] != 0) return dp[i];
           dp[i] = dp[i-1]+ dp[i-2];
           //dp[i] = ans;
        }
        
        return  dp[n];
    }
    
}