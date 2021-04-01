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
            31,
            this.alg.maxSumTwoNoOverlap(
                new int[]{2, 1, 5, 6, 0, 9, 5, 0, 3, 8}, 4, 3
            )
        );
    }
}
