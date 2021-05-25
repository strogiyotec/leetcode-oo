package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountAllRoutesTestCase {

    private CountAllRoutes alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CountAllRoutes();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            5,
            this.alg.countRoutes(
                new int[]{4, 3, 1}, 1, 0, 6
            )
        );
        Assert.assertEquals(
            4,
            this.alg.countRoutes(
                new int[]{2, 3, 6, 8, 4}, 1, 3, 5
            )
        );
    }
}
