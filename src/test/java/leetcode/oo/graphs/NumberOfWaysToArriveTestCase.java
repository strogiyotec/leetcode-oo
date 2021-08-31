package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfWaysToArriveTestCase {

    private NumberOfWaysToArrive alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NumberOfWaysToArrive();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4,
            this.alg.countPaths(
                7,
                new int[][]{
                    {0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}
                }
            )
        );
    }
}
