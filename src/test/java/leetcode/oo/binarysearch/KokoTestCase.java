package leetcode.oo.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class KokoTestCase {

    private KokoEatingBanana alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new KokoEatingBanana();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4,
            this.alg.minEatingSpeed(
                new int[]{3, 6, 7, 11}, 8
            )
        );
        Assert.assertEquals(
            23,
            this.alg.minEatingSpeed(
                new int[]{30, 11, 23, 4, 20}, 6
            )
        );
        Assert.assertEquals(
            30,
            this.alg.minEatingSpeed(
                new int[]{30, 11, 23, 4, 20}, 5
            )
        );
    }
}
