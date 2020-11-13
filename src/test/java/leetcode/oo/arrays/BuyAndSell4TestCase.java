package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BuyAndSell4TestCase {

    private BuyAndSell4 alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new BuyAndSell4();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            7L,
            (long) this.alg.maxProfit(
                2,
                new int[]{3, 2, 6, 5, 0, 3}
            )
        );
    }
}
