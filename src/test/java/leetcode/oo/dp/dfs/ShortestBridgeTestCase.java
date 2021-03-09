package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ShortestBridgeTestCase {

    private ShortestBridge alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ShortestBridge();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            1,
            this.alg.shortestBridge(
                new int[][]{
                    {0, 1},
                    {1, 0}
                }
            )
        );
    }
}
