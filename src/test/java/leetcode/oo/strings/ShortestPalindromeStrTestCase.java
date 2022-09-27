package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ShortestPalindromeStrTestCase {

    private ShortestPalindrome alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ShortestPalindrome();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            this.alg.shortestPalindrome("abcd"),
            "dcbabcd"
        );
        Assert.assertEquals(
            this.alg.shortestPalindrome("aab"),
            "baab"
        );
    }
}
