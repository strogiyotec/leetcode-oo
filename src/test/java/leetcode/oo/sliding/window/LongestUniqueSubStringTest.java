package leetcode.oo.sliding.window;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test min window substring.
 */
public final class LongestUniqueSubStringTest {

    /**
     * Alg to test.
     */
    private final LongestUniqueSubString longestUniqueSubString = new LongestUniqueSubString();

    /**
     * Min window test.
     */
    @Test
    public void minWindow() {
        Assert.assertThat(
                longestUniqueSubString.minWindow("ADOBECODEBANC", "ABC"),
                CoreMatchers.is("BANC")
        );
        Assert.assertThat(
                longestUniqueSubString.minWindow("aa", "aa"),
                CoreMatchers.is("aa")
        );
    }
}