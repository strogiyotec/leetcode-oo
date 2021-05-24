package leetcode.oo.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TransposeTestCase {

    private Transpose alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new Transpose();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(
            new int[][]{
                {1,4},
                {2,5},
                {3,6}
            },
            this.alg.transpose(new int[][]{{1,2,3},{4,5,6}})
        );
    }
}
