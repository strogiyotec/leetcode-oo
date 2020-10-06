package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class GoodPairsTestCase {

    private GoodPairs alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new GoodPairs();
    }

    @Test
    public void test() {
        Assert.assertEquals(4L, (long) this.alg.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        Assert.assertEquals(6L, (long) this.alg.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }
}
