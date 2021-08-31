package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountServerCommunicateTestCase {

    private CountServersCommunicate alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CountServersCommunicate();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.countServers(
                new int[][]{
                    {1, 0}, {1, 1}
                }
            )
        );
        Assert.assertEquals(
            4,
            this.alg.countServers(
                new int[][]{
                    {1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}
                }
            )
        );
    }
}
