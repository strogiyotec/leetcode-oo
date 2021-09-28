package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountSubIslandsTestCase {

    private CountSubIslands alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new CountSubIslands();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            3,
            this.alg.countSubIslands(
                new int[][]{
                    {1, 1, 1, 0, 0}, {0, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 1, 1}
                },
                new int[][]{
                    {1, 1, 1, 0, 0}, {0, 0, 1, 1, 1}, {0, 1, 0, 0, 0}, {1, 0, 1, 1, 0}, {0, 1, 0, 1, 0}
                }
            )
        );
    }
}
