class Solution {
    public int climbStairs(int n) {
       // int[] dp = new int [n+1];
       // int ans = 0;
        if(n<=2) return n;
        int c; //just extra varriables we take no extra space
        int a  =1;
        int b  =2;
        for(int i = 3 ;i<=n;i++){
           //if(dp[i] != 0) return dp[i];
        //    dp[i] = dp[i-1]+ dp[i-2];
           //dp[i] = ans;
           c=a+b;
           a=b;
           b=c;
        }
        
        return  b;
    }
    //practical implementation of fibonnaic no. 
    
}