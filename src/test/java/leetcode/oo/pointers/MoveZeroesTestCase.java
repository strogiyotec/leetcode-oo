package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MoveZeroesTestCase {

    private MoveZeroes alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MoveZeroes();
    }

    @Test
    public void test() {
        final int[] ar = new int[]{0, 1, 0, 3, 12};
        this.alg.moveZeroes(ar);
        Assert.assertArrayEquals(
                ar,
                new int[]{1, 3, 12, 0, 0}
        );
    }
}
