package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NearestPointTestCase {

    private NearestPoint alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NearestPoint();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.nearestValidPoint(
                3, 4, new int[][]{
                    {1, 2},
                    {3, 1},
                    {2, 4},
                    {2, 3},
                    {4, 4}
                }
            )
        );
    }
}
