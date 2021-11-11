package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinFallingPathTestCase {

    private MinFallingPath alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinFallingPath();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            13,
            this.alg.minFallingPathSum(
                new int[][]{
                    {2, 1, 3}, {6, 5, 4}, {7, 8, 9}
                }
            )
        );
    }
}
