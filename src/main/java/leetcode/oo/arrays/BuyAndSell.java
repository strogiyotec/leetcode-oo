package leetcode.oo.arrays;

final class BuyAndSell {

    int maxProfit(int[] prices) {
        return this.fastApproach(prices);
    }

    private int fastApproach(final int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxSell = 0;
        for (final int price : prices) {
            if (minBuy > price) {
                minBuy = price;
            } else {
                final int sell = price - minBuy;
                if (maxSell < sell) {
                    maxSell = sell;
                }
            }
        }
        return maxSell;
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
