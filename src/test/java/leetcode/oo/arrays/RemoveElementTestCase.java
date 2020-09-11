package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RemoveElementTestCase {

    private RemoveElement alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RemoveElement();
    }

    @Test
    public void test1() {
        final int[] array = {3, 2, 2, 3};
        Assert.assertEquals(this.alg.removeElement(array, 3), 2);
        Assert.assertArrayEquals(array, new int[]{2, 2, 2, 3});
    }

    @Test
    public void test2() {
        final int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        Assert.assertEquals(this.alg.removeElement(array, 2), 5);
        Assert.assertArrayEquals(array, new int[]{0,1,3,0,4,0,4,2});
    }
}
