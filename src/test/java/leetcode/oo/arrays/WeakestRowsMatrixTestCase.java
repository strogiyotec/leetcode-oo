package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class WeakestRowsMatrixTestCase {

    private WeakestRowsMatrix alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new WeakestRowsMatrix();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
           new int[]{2,0,3} ,
            this.alg.kWeakestRows(
                new int[][]{
                    {1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 0},
                    {1, 0, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 1}
                },
                3
            )
        );
    }
}
