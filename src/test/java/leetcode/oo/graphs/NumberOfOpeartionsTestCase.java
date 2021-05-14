package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfOpeartionsTestCase {

    private NumberOfOperationToMakeNetworkConnected alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NumberOfOperationToMakeNetworkConnected();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.makeConnected(
                6,
                new int[][]{
                    {0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}
                }
            )
        );
        Assert.assertEquals(
            -1,
            this.alg.makeConnected(
                6,
                new int[][]{
                    {0, 1}, {0, 2}, {0, 3}, {1, 2}
                }
            )
        );
    }
}
