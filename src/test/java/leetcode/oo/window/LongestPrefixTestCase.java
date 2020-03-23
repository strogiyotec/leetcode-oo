package leetcode.oo.window;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test {@link LongestPrefix}.
 */
public final class LongestPrefixTestCase {
    /**
     * Alg to test.
     */
    private LongestPrefix alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestPrefix();
    }

    /**
     * Test that common prefix is right.
     */
    @Test
    public void testCommonPrefix() {
        Assert.assertThat(
                this.alg.longestCommonPrefix(
                        new String[]{
                                "flower", "flow", "flight",
                        }
                ),
                CoreMatchers.is("fl")
        );
        Assert.assertThat(
                this.alg.longestCommonPrefix(
                        new String[]{
                                "a", "aa",
                        }
                ),
                CoreMatchers.is("a")
        );
        Assert.assertThat(
                this.alg.longestCommonPrefix(new String[0]),
                CoreMatchers.is("")
        );
    }
}