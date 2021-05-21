package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReorderRoutesTestCase {

    private ReorderRoutes alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ReorderRoutes();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.minReorder(
                6, new int[][]{
                    {0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}
                }
            )
        );
    }
}
