package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestArithmeticTestCase {

    private LongestArithmetic alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestArithmetic();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4,
            this.alg.longestSubsequence(
                new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1}, -2
            )
        );
    }
}
