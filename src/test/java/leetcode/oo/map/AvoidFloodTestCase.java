package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class AvoidFloodTestCase {

    private AvoidFlood alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new AvoidFlood();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{-1, 1, -1, 2, -1, -1},
            this.alg.avoidFlood(new int[]{1, 0, 2, 0, 2, 1})
        );
        Assert.assertArrayEquals(
            new int[]{},
            this.alg.avoidFlood(new int[]{0, 1, 1})
        );
    }
}
