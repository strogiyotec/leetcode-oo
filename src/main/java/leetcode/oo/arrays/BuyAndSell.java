package leetcode.oo.arrays;


/**
 * Best Time to Buy and Sell Stock.
 * See {@link <a href ="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">https://leetcode.com/problems/best-time-to-buy-and-sell-stock/</a>}
 */
final class BuyAndSell {

    int maxProfit(final int[] prices) {
        return this.fastApproach(prices);
    }

    private int fastApproach(final int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (final int price : prices) {
            int diff;
            if (min > price) {
                min = price;
            } else {
                diff = price - min;
                maxProfit = Math.max(diff, maxProfit);
            }
        }
        return maxProfit;
    }

    private int bruteForce(final int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            final int buy = prices[i];
            for (int j = i; j < prices.length; j++) {
                final int sell = prices[j];
                if (sell > buy) {
                    max = Math.max(max, sell - buy);
                }
            }
        }
        return max;
    }
}
