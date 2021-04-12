package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class AdvantageShuffleTestCase {

    private AdvantageShuffle alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new AdvantageShuffle();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{24, 32, 8, 12},
            this.alg.advantageCount(
                new int[]{12, 24, 8, 32},
                new int[]{13, 25, 32, 11}
            )
        );

    }
}
