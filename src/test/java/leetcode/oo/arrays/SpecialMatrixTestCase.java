package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SpecialMatrixTestCase {

    private SpecialPositionMatrix alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SpecialPositionMatrix();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            1L,
            (long) this.alg.numSpecial(
                new int[][]{
                    {1, 0, 0},
                    {0, 0, 1},
                    {1, 0, 0}
                }
            )
        );
    }
}
