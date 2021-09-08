package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SwimInRisingWaterTestCase {

    private SwimInRisingWatter alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SwimInRisingWatter();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.swimInWater(
                new int[][]{
                    {0, 2}, {1, 3}
                }
            )
        );
    }
}
