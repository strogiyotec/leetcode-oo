package leetcode.oo.stacks;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test {@link LongestParentheses}.
 */
public final class LongestParenthesesTestCase {

    /**
     * Alg to test.
     */
    private LongestParentheses alg;


    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestParentheses();
    }

    /**
     * Test parentheses length.
     */
    @Test
    public void testLength() {
        Assert.assertThat(
                this.alg.longestValidParentheses(")()())"),
                CoreMatchers.is(4)
        );
        Assert.assertThat(
                this.alg.longestValidParentheses("{"),
                CoreMatchers.is(0)
        );
        Assert.assertThat(
                this.alg.longestValidParentheses(""),
                CoreMatchers.is(0)
        );
    }
}
