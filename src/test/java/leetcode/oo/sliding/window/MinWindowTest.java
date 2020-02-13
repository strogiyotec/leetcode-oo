package leetcode.oo.sliding.window;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test min window substring.
 */
public final class MinWindowTest {

    /**
     * Alg to test.
     */
    private final MinWindow minWindow = new MinWindow();

    /**
     * Min window test.
     */
    @Test
    public void minWindow() {
        Assert.assertThat(
                minWindow.minWindow("ADOBECODEBANC", "ABC"),
                CoreMatchers.is("BANC")
        );
        Assert.assertThat(
                minWindow.minWindow("aa", "aa"),
                CoreMatchers.is("aa")
        );
    }
}