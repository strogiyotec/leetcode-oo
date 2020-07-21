package leetcode.oo.arrays;


/**
 * Best Time to Buy and Sell Stock.
 * See {@link <a href ="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">https://leetcode.com/problems/best-time-to-buy-and-sell-stock/</a>}
 */
final class BuyAndSell {

    int maxProfit(int[] prices) {
        return this.fastApproach(prices);
    }

    private int fastApproach(final int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (final int price : prices) {
            if (min > price) {
                min = price;
            } else {
                final int benefit = price - min;
                max = Math.max(benefit,max);
            }
        }
        return max;
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
