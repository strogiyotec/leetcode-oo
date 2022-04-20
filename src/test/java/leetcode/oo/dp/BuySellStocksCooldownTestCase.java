package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BuySellStocksCooldownTestCase {

    private BuySellStocksCooldown alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new BuySellStocksCooldown();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            this.alg.maxProfit(
                new int[]{1,2,3,0,2}
            ),
            3
        );
    }
}
