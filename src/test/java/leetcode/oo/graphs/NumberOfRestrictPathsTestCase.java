package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfRestrictPathsTestCase {

    private NumberOfRestrictPaths alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NumberOfRestrictPaths();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.countRestrictedPaths(
                5,
                new int[][]{
                    {1, 2, 3}, {1, 3, 3}, {2, 3, 1}, {1, 4, 2}, {5, 2, 2}, {3, 5, 1}, {5, 4, 10}
                }
            )
        );
    }
}
