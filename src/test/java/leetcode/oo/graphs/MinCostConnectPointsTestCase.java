package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinCostConnectPointsTestCase {

    private MinCostConnectPoints alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinCostConnectPoints();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            20,
            this.alg.minCostConnectPoints(
                new int[][]{
                    {0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}
                }
            )
        );
    }
}
