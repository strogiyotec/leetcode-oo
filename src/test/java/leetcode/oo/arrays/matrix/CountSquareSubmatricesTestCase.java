package leetcode.oo.arrays.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountSquareSubmatricesTestCase {

    private CountSqureSubmatrices alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CountSqureSubmatrices();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            15,
            this.alg.countSquares(
                new int[][]{
                    {0, 1, 1, 1},
                    {1, 1, 1, 1},
                    {0, 1, 1, 1}
                }
            )
        );
    }
}
