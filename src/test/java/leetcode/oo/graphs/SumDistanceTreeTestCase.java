package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SumDistanceTreeTestCase {

    private SumDistanceTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SumDistanceTree();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{8, 12, 6, 10, 10, 10},
            this.alg.sumOfDistancesInTree(
                6,
                new int[][]{
                    {0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}
                }
            )
        );
    }
}
