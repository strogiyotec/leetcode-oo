package leetcode.oo.sliding.window;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test sliding window for unique chars.
 */
public final class SlidingWindowUniqueCharsLengthTest {

    /**
     * Alg to test.
     */
    @SuppressWarnings("LineLength")
    private final SlidingWindowUniqueCharsLength length = new SlidingWindowUniqueCharsLength();

    /**
     * Test cases.
     */
    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertThat(
                this.length.lengthOfLongestSubstring("abcabcbb"),
                CoreMatchers.is(3)
        );
        Assert.assertThat(
                this.length.lengthOfLongestSubstring("bbbbb"),
                CoreMatchers.is(1)
        );
        Assert.assertThat(
                this.length.lengthOfLongestSubstring("pwwkew"),
                CoreMatchers.is(3)
        );
    }
}