package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RemoveCoveredTestCase {

    private RemoveCovered alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RemoveCovered();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2L,
            (long) this.alg.removeCoveredIntervals(
                new int[][]{
                    {1, 4},
                    {3, 6},
                    {2, 8}
                }
            )
        );
    }
}
