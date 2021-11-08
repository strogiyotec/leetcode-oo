package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestSubseqRepeatedTestCase {

    private LongestSubseqRepeated alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestSubseqRepeated();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "let",
            this.alg.longestSubsequenceRepeatedK(
                "letsleetcode", 2
            )
        );
    }
}
