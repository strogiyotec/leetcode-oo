package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxLengthSubArrayTestCase {

    private MaxLengthRepeatedSubArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxLengthRepeatedSubArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3L,
            (long) this.alg.findLength(
                new int[]{1, 2, 3, 2, 1},
                new int[]{3, 2, 1, 4, 7}
            )
        );
        Assert.assertEquals(
            5L,
            (long) this.alg.findLength(
                new int[]{0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0}
            ));
    }
}
