package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SplitArrayIntoThreeTestCase {

    private SplitArrayIntoThree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SplitArrayIntoThree();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            1,
            this.alg.waysToSplit(
                new int[]{1,1,1}
            )
        );
        Assert.assertEquals(
            3,
            this.alg.waysToSplit(
                new int[]{1, 2, 2, 2, 5, 0}
            )
        );

    }
}
