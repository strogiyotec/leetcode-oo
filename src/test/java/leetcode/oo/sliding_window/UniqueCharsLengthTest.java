package leetcode.oo.sliding_window;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for string builder unique length.
 */
public final class UniqueCharsLengthTest {

    /**
     * Alg to test.
     */
    private final UniqueCharsLength length = new UniqueCharsLength();

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