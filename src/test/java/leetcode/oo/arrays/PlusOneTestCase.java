package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PlusOneTestCase {

    private PlusOne alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PlusOne();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
                this.alg.plusOne(new int[]{0, 0, 0}),
                new int[]{0, 0, 1}
        );
        Assert.assertArrayEquals(
                this.alg.plusOne(new int[]{8, 9, 9}),
                new int[]{9, 0, 0}
        );
        Assert.assertArrayEquals(
                this.alg.plusOne(new int[]{9, 9, 9}),
                new int[]{1, 0, 0, 0}
        );
        Assert.assertArrayEquals(
                this.alg.plusOne(new int[]{1,2,3}),
                new int[]{1,2,4}
        );
    }
}
