package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxSumCircularArrayTestCase {

    private MaxSumCircularSubArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxSumCircularSubArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            10,
            this.alg.maxSubarraySumCircular(
                new int[]{
                    5, -2, 5
                }
            )
        );
        Assert.assertEquals(
            -2,
            this.alg.maxSubarraySumCircular(
                new int[]{
                    -3, -2, -3
                }
            )
        );
    }
}
