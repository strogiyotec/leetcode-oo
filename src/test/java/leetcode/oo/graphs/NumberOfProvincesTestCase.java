package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfProvincesTestCase {

    private NumberOfProvinces alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new NumberOfProvinces();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            2L,
            this.alg.findCircleNum(
                new int[][]{
                    {1, 1, 0},
                    {1, 1, 0},
                    {0, 0, 1}
                }
            )
        );
    }
}
