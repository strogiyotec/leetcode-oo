package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
public final class FinalPrices {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FinalPrices().finalPrices(
            new int[]{8, 4, 6, 2, 3}
        )));
    }

    public int[] finalPrices(final int[] prices) {
        final int[] discounts = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            discounts[i] = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[i]) {
                    discounts[i] -= prices[j];
                    break;
                }
            }
        }
        return discounts;
    }
}
