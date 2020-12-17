package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SubArrayProductTestCase {

    private SubArrayProduct alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SubArrayProduct();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            18L,
            (long) this.alg.numSubarrayProductLessThanK(new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3}, 19)
        );
        Assert.assertEquals(
            8L,
            (long) this.alg.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100)
        );
    }
}
