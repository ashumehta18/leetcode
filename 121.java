https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=array


class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int b = prices[0];
        int profit = 0;
         
        for(int i = 1; i<n;i++){
            if(b > prices[i]){
                b= prices[i];
            }
            else if(prices[i]-b>profit){
                profit = prices[i]-b;
            }
        }
        return profit;
    }
}
