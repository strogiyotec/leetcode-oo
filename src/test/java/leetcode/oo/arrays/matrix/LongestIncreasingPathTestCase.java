package leetcode.oo.arrays.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestIncreasingPathTestCase {

    private LongestIncreasingPath alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new LongestIncreasingPath();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            4,
            this.alg.longestIncreasingPath(
                new int[][]{
                    {9, 9, 4}, {6, 6, 8}, {2, 1, 1}
                }
            )
        );
    }
}
