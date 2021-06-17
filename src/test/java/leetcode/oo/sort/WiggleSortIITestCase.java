package leetcode.oo.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class WiggleSortIITestCase {

    private WiggleSortII alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new WiggleSortII();
    }

    @Test
    public void test() {
        final int[] nums = {1, 3, 2, 2, 3, 1};
        this.alg.wiggleSort(nums);
        Assert.assertArrayEquals(
            new int[]{2, 3, 1, 3, 1, 2},
            nums
        );
    }
}
