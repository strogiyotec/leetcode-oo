package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RotateArrayTestCase {

    private RotateArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RotateArray();
    }

    @Test
    public void test() {
        final int[] array = {1, 2, 3, 4, 5, 6, 7};
        this.alg.rotate(array, 3);
        Assert.assertArrayEquals(
            array,
            new int[]{5, 6, 7, 1, 2, 3, 4}
        );
    }
}
