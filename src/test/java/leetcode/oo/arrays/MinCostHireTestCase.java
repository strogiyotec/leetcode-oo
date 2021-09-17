package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinCostHireTestCase {

    private MinCostHire alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinCostHire();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            30.66667,
            this.alg.mincostToHireWorkers(
                new int[]{3, 1, 10, 10, 1},
                new int[]{4, 8, 2, 2, 7},
                3
            ),
            10
        );
        Assert.assertEquals(
            14.0,
            this.alg.mincostToHireWorkers(
                new int[]{2},
                new int[]{14},
                1
            ),
            2
        );
        Assert.assertEquals(
            105.0,
            this.alg.mincostToHireWorkers(
                new int[]{10, 20, 5},
                new int[]{70, 50, 30},
                2
            ),
            2
        );
    }
}
