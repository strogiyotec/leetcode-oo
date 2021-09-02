package leetcode.oo.arrays.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class Matrix01TestCase {

    private Matrix01 alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new Matrix01();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(
            new int[][]{
                {0, 0, 0}, {0, 1, 0}, {1, 2, 1}
            },
            this.alg.updateMatrix(
                new int[][]{
                    {0, 0, 0}, {0, 1, 0}, {1, 1, 1}
                }
            )
        );
    }
}
