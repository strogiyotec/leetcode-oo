package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MatrixDiagSumTestCase {

    private MatrixDiagSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MatrixDiagSum();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            25,
            this.alg.diagonalSum(
                new int[][]{
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                }
            )
        );
    }
}
