package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CubesTestCase {

    private Cubes alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new Cubes();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            190L,
            (long) this.alg.maxHeight(
                new int[][]{
                    {50, 45, 20},
                    {95, 37, 53},
                    {45, 23, 12}
                }
            )
        );
    }
}
