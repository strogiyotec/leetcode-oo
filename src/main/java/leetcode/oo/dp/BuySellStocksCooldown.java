package leetcode.oo.dp;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
final class BuySellStocksCooldown {

    public int maxProfit(final int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int maxDiff = Integer.MIN_VALUE; // M[j - 2] - prices[j]
        final int[] maxProfits = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            if (i < 2) {
                maxDiff = Math.max(maxDiff, -prices[i]);
            }
            if (i == 0) {
                maxProfits[0] = 0;
            } else if (i == 1) {
                maxProfits[1] = Math.max(0, prices[1] - prices[0]);
            } else {
                maxProfits[i] = Math.max(maxProfits[i - 1], maxDiff + prices[i]);
                maxDiff = Math.max(maxDiff, maxProfits[i - 2] - prices[i]);
            }
        }
        return maxProfits[prices.length - 1];
    }

}
