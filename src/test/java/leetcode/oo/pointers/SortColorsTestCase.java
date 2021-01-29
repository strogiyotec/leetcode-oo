package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SortColorsTestCase {

    private SortColors alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SortColors();
    }

    @Test
    public void testTwo() {
        final int[] ar = {2, 0, 1};
        this.alg.sortColors(ar);
        Assert.assertArrayEquals(
                ar,
                new int[]{0, 1, 2}
        );
    }

    @Test
    public void testOne() {
        final int[] ar = {2, 0, 2, 1, 1, 0};
        this.alg.sortColors(ar);
        Assert.assertArrayEquals(
                ar,
                new int[]{0, 0, 1, 1, 2, 2}
        );
    }
}
