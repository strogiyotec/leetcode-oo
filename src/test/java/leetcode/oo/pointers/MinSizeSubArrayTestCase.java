package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinSizeSubArrayTestCase {

    private MinSizeSubArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinSizeSubArray();
    }

    @Test
    public void test() {

        Assert.assertEquals(
                this.alg.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}),
                2
        );
        Assert.assertEquals(
                this.alg.minSubArrayLen(100, new int[]{}),
                0
        );
    }
}
