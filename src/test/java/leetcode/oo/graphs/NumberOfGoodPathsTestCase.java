package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfGoodPathsTestCase {

    private NumberOfGoodPaths alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new NumberOfGoodPaths();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            6,
            this.alg.numberOfGoodPaths(
                new int[]{1, 3, 2, 1, 3},
                new int[][]{
                    {0, 1}, {0, 2}, {2, 3}, {2, 4}
                }
            )
        );
    }
}
