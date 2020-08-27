package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FirstAndLastTestCase {

    private FirstAndLast alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new FirstAndLast();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
                this.alg.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6),
                new int[]{-1, -1}
        );
        Assert.assertArrayEquals(
                this.alg.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8),
                new int[]{3, 4}
        );
        Assert.assertArrayEquals(
                this.alg.searchRange(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10}, 8),
                new int[]{7, 8}
        );
    }
}
