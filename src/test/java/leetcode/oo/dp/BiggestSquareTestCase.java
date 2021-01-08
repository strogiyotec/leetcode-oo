package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BiggestSquareTestCase {

    private BiggestSquare alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new BiggestSquare();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            4L,
            (long) this.alg.maximalSquare(
                new char[][]{
                    {'1', '0', '1', '0', '0'},
                    {'1', '0', '1', '1', '1'},
                    {'1', '1', '1', '1', '1'},
                    {'1', '0', '0', '1', '0'}
                }
            )
        );
    }
}
