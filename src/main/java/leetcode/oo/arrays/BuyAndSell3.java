package leetcode.oo.arrays;

/**
 * Best Time to Buy and Sell Stock 3.
 * See {@link <a href ="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/">https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/</a>}
 */
final class BuyAndSell3 {

    int maxProfit(final int[] prices) {
        int s1 = -prices[0];
        int s2 = Integer.MIN_VALUE;
        int s3 = Integer.MIN_VALUE;
        int s4 = Integer.MIN_VALUE;
        for (final int price : prices) {
            s1 = Math.max(s1, -price);
            s2 = Math.max(s2, s1 + price);
            s3 = Math.max(s3, s2 - price);
            s4 = Math.max(s4, s3 + price);
        }
        return s4;
    }
}
