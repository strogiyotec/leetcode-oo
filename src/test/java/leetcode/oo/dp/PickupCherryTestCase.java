package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PickupCherryTestCase {

    private PickupCherry alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PickupCherry();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            5,
            this.alg.cherryPickup(
                new int[][]{
                    {0, 1, -1}, {1, 0, -1}, {1, 1, 1}
                }
            )
        );
        Assert.assertEquals(
            0,
            this.alg.cherryPickup(
                new int[][]{
                    {1, 1, -1}, {1, -1, 1}, {-1, 1, 1}
                }
            )
        );
    }
}
