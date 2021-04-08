package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class OutOfBoundaryPathTestCase {

    private OutOfBoundaryPath alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new OutOfBoundaryPath();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            6,
            this.alg.findPaths(
                2, 2, 2, 0, 0
            )
        );
    }
}
