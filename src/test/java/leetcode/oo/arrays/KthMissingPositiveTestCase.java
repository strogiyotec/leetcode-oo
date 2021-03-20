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
            9,
            this.alg.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5)
        );
    }
}
