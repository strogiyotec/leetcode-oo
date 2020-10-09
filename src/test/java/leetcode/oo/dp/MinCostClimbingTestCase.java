package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinCostClimbingTestCase {
    private MinCostClimbing alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinCostClimbing();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            6L,
            (long) this.alg.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})
        );
    }
}
