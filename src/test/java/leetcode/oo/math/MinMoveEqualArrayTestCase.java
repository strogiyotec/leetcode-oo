package leetcode.oo.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinMoveEqualArrayTestCase {

    private MinMoveEqualArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinMoveEqualArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.minMoves(
                new int[]{1, 2, 3}
            )
        );
    }
}
