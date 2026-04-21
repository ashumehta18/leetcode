class Solution {
    public int coinChange(int[] coins, int amount) {
        // dp[i] = min coins needed to make amount i
        int[] dp = new int[amount + 1];

        // Fill with a large number (infinity)
        Arrays.fill(dp, amount + 1);

        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;

        // Build up solution for every amount from 1 to amount
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    // Option: use this coin, take best result
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If still "infinity", amount is not reachable
        return dp[amount] > amount ? -1 : dp[amount];
    }
}