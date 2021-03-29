package leetcode.oo.arrays.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RotateImageTestCase {

    private RotateImage alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RotateImage();
    }

    @Test
    public void test() {
        final int[][] matrix = {
            {5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}
        };
        this.alg.rotate(matrix);
        Assert.assertArrayEquals(
            new int[][]{
                {15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}
            },
            matrix
        );
    }
}
