package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BinarySearchTestCase {

    private BinarySearch alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new BinarySearch();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4L,
            (long) this.alg.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)
        );
    }
}
