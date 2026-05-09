class Solution {
    public int maxProfit(int[] prices) {
        int pro = 0;
        int min = prices[0];
        int n = prices.length;

        for(int i = 1 ;i<n;i++){
            min = Math.min(min,prices[i]);

            int profit =prices[i] - min;
            pro = Math.max(pro,profit);

        }
        return pro;

    }
}