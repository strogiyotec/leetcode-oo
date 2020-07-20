package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BuyAndSellTestCase {

    private BuyAndSell alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new BuyAndSell();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.maxProfit(new int[]{7, 1, 5, 3, 6, 4}),
                5
        );
    }
}
