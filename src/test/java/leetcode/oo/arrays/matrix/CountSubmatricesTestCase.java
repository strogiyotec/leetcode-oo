package leetcode.oo.arrays.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountSubmatricesTestCase {

    private CountSubmatrices alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CountSubmatrices();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            13,
            this.alg.numSubmat(
                new int[][]{
                    {1, 0, 1},
                    {1, 1, 0},
                    {1, 1, 0}
                }
            )
        );
    }
}
