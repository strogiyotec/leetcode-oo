package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SquaresSortedArrayTestCase {

    private SquaresSortedArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SquaresSortedArray();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
                this.alg.sortedSquares(new int[]{-4, -1, 0, 3, 10}),
                new int[]{0, 1, 9, 16, 100}
        );
    }
}
