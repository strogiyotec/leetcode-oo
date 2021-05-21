package leetcode.oo.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinDaysBouquetsTestCase {

    private MinNumberDaysBouquets alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinNumberDaysBouquets();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            1000000000,
            this.alg.minDays(
                new int[]{1000000000, 1000000000}, 1, 1
            )
        );
        Assert.assertEquals(
            12,
            this.alg.minDays(
                new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3
            )
        );
        Assert.assertEquals(
            3,
            this.alg.minDays(
                new int[]{1, 10, 3, 10, 2}, 3, 1
            )
        );
    }
}
