package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LargeIslandTestCase {

    private LargeIsland alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LargeIsland();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            1,
            this.alg.largestIsland(
                new int[][]{
                    {0,0},
                    {0,0}
                }
            )
        );
        Assert.assertEquals(
            4,
            this.alg.largestIsland(
                new int[][]{
                    {1, 1},
                    {1, 1}
                }
            )
        );
        Assert.assertEquals(
            6,
            this.alg.largestIsland(
                new int[][]{
                    {0, 1, 0, 1, 0},
                    {1, 1, 0, 0, 1},
                    {0, 0, 1, 1, 0},
                }
            )
        );
    }
}
