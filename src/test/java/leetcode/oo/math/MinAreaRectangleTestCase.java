package leetcode.oo.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinAreaRectangleTestCase {

    private MinAreaRectangle alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinAreaRectangle();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.minAreaRect(
                new int[][]{
                    {1,1},{1,3},{3,1},{3,3},{4,1},{4,3}
                }
            )
        );
        Assert.assertEquals(
            4,
            this.alg.minAreaRect(
                new int[][]{
                    {1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}
                }
            )
        );
    }
}
