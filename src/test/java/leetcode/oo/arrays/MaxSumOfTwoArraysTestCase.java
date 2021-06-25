package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxSumOfTwoArraysTestCase {

    private MaxSumOfTwoArrays alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxSumOfTwoArrays();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            29,
            this.alg.maxSumTwoNoOverlap(
                new int[]{3, 8, 1, 3, 2, 1, 8, 9, 0}, 3, 2
            )
        );
        Assert.assertEquals(
            20,
            this.alg.maxSumTwoNoOverlap(
                new int[]{0, 6, 5, 2, 2, 5, 1, 9, 4}, 2, 1
            )
        );
        Assert.assertEquals(
            31,
            this.alg.maxSumTwoNoOverlap(
                new int[]{2, 1, 5, 6, 0, 9, 5, 0, 3, 8}, 4, 3
            )
        );
    }
}
