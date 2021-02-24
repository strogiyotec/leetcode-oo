package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfClosedIslandsTestCase {

    private NumberOfClosedIslands alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NumberOfClosedIslands();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            5,
            this.alg.closedIsland(
                new int[][]{
                    {0, 0, 1, 1, 0, 1, 0, 0, 1, 0},
                    {1, 1, 0, 1, 1, 0, 1, 1, 1, 0},
                    {1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
                    {0, 1, 1, 0, 0, 0, 0, 1, 0, 1},
                    {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                    {0, 1, 0, 1, 0, 1, 0, 1, 1, 1},
                    {1, 0, 1, 0, 1, 1, 0, 0, 0, 1},
                    {1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 1, 0, 1, 0, 1},
                    {1, 1, 1, 0, 1, 1, 0, 1, 1, 0}
                }
            )
        );
    }
}
