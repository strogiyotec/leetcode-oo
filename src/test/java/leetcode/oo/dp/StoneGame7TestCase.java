package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class StoneGame7TestCase {

    private StoneGame7 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new StoneGame7();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            6,
            this.alg.stoneGameVII(
                new int[]{5, 3, 1, 4, 2}
            )
        );
    }
}
