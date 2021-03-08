package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NetworkDelayTestCase {

    private NetworkDelay alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NetworkDelay();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.networkDelayTime(
                new int[][]{
                    {1, 2, 1},
                    {2, 3, 2},
                    {1, 3, 4}
                },
                3,
                1
            )
        );
        Assert.assertEquals(
            2L,
            (long) this.alg.networkDelayTime(
                new int[][]{
                    {1, 2, 1}, {2, 3, 2}, {1, 3, 2}
                },
                3, 1
            )
        );
        Assert.assertEquals(
            2L,
            (long) this.alg.networkDelayTime(
                new int[][]{
                    {2, 1, 2}, {1, 2, 1}
                },
                2, 2
            )
        );
        Assert.assertEquals(
            2L,
            (long) this.alg.networkDelayTime(
                new int[][]{
                    {2, 1, 1}, {2, 3, 1}, {3, 4, 1}
                },
                4, 2
            )
        );
    }
}
