package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestPalindromeTestCase {

    private LongestPalindrome alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestPalindrome();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            7,
            this.alg.longestPalindrome("abccccdd")
        );
    }
}
