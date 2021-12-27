package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestPalindromeSubseqTestCase {

    private LongestPalindromeSubseq alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestPalindromeSubseq();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4,
            this.alg.longestPalindromeSubseq(
                "bbbab"
            )
        );
        Assert.assertEquals(
            2,
            this.alg.longestPalindromeSubseq(
                "cbbd"
            )
        );
        Assert.assertEquals(
            1,
            this.alg.longestPalindromeSubseq("a")
        );
    }

}
