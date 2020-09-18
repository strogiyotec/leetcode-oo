package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class KthLargestTestCase {

    private KthLargest alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new KthLargest();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.findKthLargest(
                        new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4
                ),
                4
        );
        Assert.assertEquals(this.alg.findKthLargest(
                new int[]{3, 2, 1, 5, 6, 4}, 2
                ),
                5
        );
    }
}
