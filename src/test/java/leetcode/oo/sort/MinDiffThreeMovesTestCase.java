package leetcode.oo.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinDiffThreeMovesTestCase {

    private MinDiffInThreeMoves alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinDiffInThreeMoves();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.minDifference(new int[]{6, 6, 0, 1, 1, 4, 6})
        );
        Assert.assertEquals(
            1,
            this.alg.minDifference(new int[]{1, 5, 0, 10, 14})
        );
    }
}
