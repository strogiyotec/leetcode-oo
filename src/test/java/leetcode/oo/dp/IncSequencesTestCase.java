package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class IncSequencesTestCase {

    private IncSequences alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new IncSequences();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            5L,
            (long) this.alg.findNumberOfLIS(new int[]{2, 2, 2, 2, 2})
        );
        Assert.assertEquals(
            2L,
            (long) this.alg.findNumberOfLIS(new int[]{1, 3, 5, 4, 7})
        );
        Assert.assertEquals(
            3L,
            (long) this.alg.findNumberOfLIS(new int[]{1, 2, 4, 3, 5, 4, 7, 2})
        );
    }
}
