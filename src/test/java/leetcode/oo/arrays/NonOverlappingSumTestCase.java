package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NonOverlappingSumTestCase {

    private NonOverLappingArraysSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NonOverLappingArraysSum();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            -1,
            this.alg.minSumOfLengths(
                new int[]{5, 5, 4, 4, 5},
                3
            )
        );
        Assert.assertEquals(
            3,
            this.alg.minSumOfLengths(
                new int[]{3, 1, 1, 1, 5, 1, 2, 1},
                3
            )
        );
        Assert.assertEquals(
            2,
            this.alg.minSumOfLengths(
                new int[]{3, 2, 2, 4, 3},
                3
            )
        );
        Assert.assertEquals(
            -1,
            this.alg.minSumOfLengths(
                new int[]{1, 6, 1},
                7
            )
        );
        Assert.assertEquals(
            5,
            this.alg.minSumOfLengths(
                new int[]{2, 1, 3, 3, 2, 3, 1},
                6
            )
        );
    }
}
