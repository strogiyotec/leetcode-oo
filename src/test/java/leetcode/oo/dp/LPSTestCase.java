package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LPSTestCase {

    private LPS alg;

    @Before
    public void init() {
        this.alg = new LPS();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "bb",
            this.alg.longestPalindrome("cbbd")
        );
        Assert.assertEquals(
            this.alg.longestPalindrome("babad"),
            "bab"
        );
        Assert.assertEquals(
            this.alg.longestPalindrome("racecar"),
            "racecar"
        );
    }

}
