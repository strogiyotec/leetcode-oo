package leetcode.oo.arrays;

/**
 * Best Time to Buy and Sell Stock 4.
 * See {@link <a href ="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/">https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/</a>}
 */
final class BuyAndSell4 {

    int maxProfit(final int k, final int[] prices) {
        final int[] dp = new int[prices.length];
        for (int i = 0; i < k; i++) {
            int buy = -prices[0];
            int sell = 0;
            for (int j = 0; j < prices.length; j++) {
                buy = Math.max(buy, dp[j] - prices[j]);
                sell = Math.max(sell, buy + prices[j]);
                dp[j] = sell;
            }
        }
        return dp[prices.length - 1];
    }
}
