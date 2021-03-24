package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class KthMissingPositiveTestCase {

    private KthMissingPositive alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new KthMissingPositive();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            14,
            this.alg.findKthPositive(new int[]{5,6,7,8,9}, 9)
        );
        Assert.assertEquals(
            9,
            this.alg.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5)
        );
        Assert.assertEquals(
            6,
            this.alg.findKthPositive(new int[]{1,2,3,4}, 2)
        );
    }
}
