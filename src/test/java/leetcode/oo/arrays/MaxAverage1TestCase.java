package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxAverage1TestCase {

    private MaxAverage1 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxAverage1();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            12.75,
            this.alg.findMaxAverage(
                new int[]{1, 12, -5, -6, 50, 3}, 4
            ),
            0
        );
    }
}
