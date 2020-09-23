package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TilePossibilitiesTestCase {

    private TilePossibilities alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new TilePossibilities();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            8L,
            (long) this.alg.numTilePossibilities("AAB")
        );
        Assert.assertEquals(
            188L,
            (long) this.alg.numTilePossibilities("AAABBC")
        );
    }
}
