package leetcode.oo.window;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test min window substring.
 */
public final class MinWindowSubstringTest {

    /**
     * Alg to test.
     */
    private MinWindowSubstring alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinWindowSubstring();
    }

    /**
     * Min window test.
     */
    @Test
    public void minWindow() {
        Assert.assertThat(
                this.alg.minWindow("bbaa", "aba"),
                CoreMatchers.is("baa")
        );
        Assert.assertThat(
                this.alg.minWindow("bba", "ab"),
                CoreMatchers.is("ba")
        );
        Assert.assertThat(
                this.alg.minWindow("ADOBECODEBANC", "ABC"),
                CoreMatchers.is("BANC")
        );
        Assert.assertThat(
                this.alg.minWindow("aa", "aa"),
                CoreMatchers.is("aa")
        );
    }
}