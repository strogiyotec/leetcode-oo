package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ThreeSumClosestTestCase {

    private ThreeSumClosest alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ThreeSumClosest();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.threeSumClosest(
                new int[]{-1, 2, 1, -4}, 1
            )
        );
    }
}
