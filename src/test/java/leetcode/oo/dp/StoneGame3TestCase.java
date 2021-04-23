package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class StoneGame3TestCase {

    private StoneGame3 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new StoneGame3();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "Tie",
            this.alg.stoneGameIII(
                new int[]{-1, -2, -3}
            )
        );
        Assert.assertEquals(
            "Tie",
            this.alg.stoneGameIII(
                new int[]{1, 2, 3, 6}
            )
        );
        Assert.assertEquals(
            "Alice",
            this.alg.stoneGameIII(
                new int[]{1, 2, 3, -9}
            )
        );
    }
}
