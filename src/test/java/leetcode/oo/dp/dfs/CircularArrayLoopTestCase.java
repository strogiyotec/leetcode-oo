package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CircularArrayLoopTestCase {

    private CircularArrayLoop alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CircularArrayLoop();
    }

    @Test
    public void test() {
        Assert.assertTrue(
            this.alg.circularArrayLoop(
                new int[]{
                    2, -1, 1, 2, 2
                }
            )
        );
    }
}
