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
            3,
            this.alg.minDays(
                new int[]{1, 10, 3, 10, 2}, 3, 1
            )
        );
    }
}
