package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BuyAndSell3TestCase {

    private BuyAndSell3 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new BuyAndSell3();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            6L,
            (long) this.alg.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4})
        );
    }
}
