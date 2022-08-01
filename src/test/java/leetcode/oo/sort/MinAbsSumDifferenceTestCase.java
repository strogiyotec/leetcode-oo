package leetcode.oo.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinAbsSumDifferenceTestCase {

    private MinAbsoluteSumDifference alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinAbsoluteSumDifference();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            this.alg.minAbsoluteSumDiff(
                new int[]{1, 7, 5},
                new int[]{2, 3, 5}
            ),
            3
        );
    }
}
