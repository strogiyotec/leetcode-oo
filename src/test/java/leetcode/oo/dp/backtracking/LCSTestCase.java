package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LCSTestCase {

    /**
     * Alg to test.
     */
    private LCS algorithm;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.algorithm = new LCS();
    }

    /**
     * Test case from leetcode.
     */
    @Test
    public void testLCS() {
        Assert.assertEquals(
                this.algorithm.longestCommonSubsequence("abcde", "ace"),
                3
        );
    }
}
