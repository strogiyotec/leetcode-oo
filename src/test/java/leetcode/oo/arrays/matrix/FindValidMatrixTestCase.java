package leetcode.oo.arrays.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FindValidMatrixTestCase {

    private FindValidMatrixGivenSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new FindValidMatrixGivenSum();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[][]{
                {3, 0},
                {1, 7}
            },
            this.alg.restoreMatrix(
                new int[]{3, 8},
                new int[]{4, 7}
            )
        );
    }
}
