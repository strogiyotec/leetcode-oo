package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MergeArraysTestCase {

    private MergeArrays alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MergeArrays();
    }

    @Test
    public void test() {
        final int[] array = {1, 2, 3, 0, 0, 0};
        this.alg.merge(
                array, 3,
                new int[]{2, 5, 6}, 3
        );
        Assert.assertArrayEquals(
                array,
                new int[]{1, 2, 2, 3, 5, 6}
        );
    }
}
