package leetcode.oo.window;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test min window substring.
 */
public final class LongestUniqueSubStringTest {

    /**
     * Alg to test.
     */
    private LongestUniqueSubString alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestUniqueSubString();
    }

    /**
     * Min window test.
     */
    @Test
    public void minWindow() {
        Assert.assertThat(
                alg.minWindow("ADOBECODEBANC", "ABC"),
                CoreMatchers.is("BANC")
        );
        Assert.assertThat(
                alg.minWindow("aa", "aa"),
                CoreMatchers.is("aa")
        );
    }
}