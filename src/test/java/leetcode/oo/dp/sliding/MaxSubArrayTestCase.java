package leetcode.oo.dp.sliding;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxSubArrayTestCase {

    private MaxSubArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxSubArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}),
                6
        );
    }
}
