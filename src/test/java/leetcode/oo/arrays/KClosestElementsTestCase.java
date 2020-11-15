package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class KClosestElementsTestCase {
    private KClosestElements alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new KClosestElements();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[][]{
                {3, 3},
                {-2, 4}
            },
            this.alg.kClosest(
                new int[][]{
                    {3, 3},
                    {5, -1},
                    {-2, 4}
                }, 2
            )
        );
    }
}
