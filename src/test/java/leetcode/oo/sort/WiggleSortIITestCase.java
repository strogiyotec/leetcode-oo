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

    @Test
    public void test2() {
        final int[] nums = {1, 1, 2, 1, 2, 2, 1};
        this.alg.wiggleSort(nums);
        Assert.assertArrayEquals(
            new int[]{1, 2, 1, 2, 1, 2, 1},
            nums
        );
    }

    @Test
    public void test3() {
        final int[] nums = {1, 5, 1, 1, 6, 4};
        this.alg.wiggleSort(nums);
        Assert.assertArrayEquals(
            new int[]{1, 6, 1, 5, 1, 4},
            nums
        );
    }

    @Test
    public void test4() {
        final int[] nums = {1, 1, 2, 1, 2, 2, 1};
        this.alg.wiggleSort(nums);
        Assert.assertArrayEquals(
            new int[]{1, 2, 1, 2, 1, 2, 1},
            nums
        );

    }
}
