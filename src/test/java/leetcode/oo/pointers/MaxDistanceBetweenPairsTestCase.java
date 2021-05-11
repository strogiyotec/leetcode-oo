package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxDistanceBetweenPairsTestCase {

    private MaxDistanceBetweenPairs alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxDistanceBetweenPairs();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.maxDistance(
                new int[]{55, 30, 5, 4, 2},
                new int[]{100, 20, 10, 10, 5}
            )
        );
    }
}
