package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TaxiTestCase {

    private Taxi alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Taxi();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            20L,
            this.alg.maxTaxiEarnings(
                20,
                new int[][]{
                    {1, 6, 1}, {3, 10, 2}, {10, 12, 3}, {11, 12, 2}, {12, 15, 2}, {13, 18, 1}
                }
            )
        );
    }
}
