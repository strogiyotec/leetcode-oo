package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SearchMatrixTestCase {

    private SearchMatrix alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new SearchMatrix();
    }

    @Test
    public void test(){
        Assert.assertFalse(
            this.alg.searchMatrix(
                new int[][]{
                    {1, 3, 5, 7},
                    {10, 11, 16, 20},
                    {23, 30, 34,60}
                }, 13
            )
        );
        Assert.assertTrue(
            this.alg.searchMatrix(
                new int[][]{
                    {1, 3, 5, 7},
                    {10, 11, 16, 20},
                    {23, 30, 34,60}
                }, 16
            )
        );
    }
}
