package leetcode.oo.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test {@link leetcode.oo.stacks.ValidParentheses}.
 */
public final class ValidParenthesesTestCase {

    /**
     * Alg to test.
     */
    private ValidParentheses alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ValidParentheses();
    }

    /**
     * Test that parentheses is valid.
     */
    @Test
    public void testValid() {
        Assert.assertTrue(this.alg.isValid(""));
        Assert.assertTrue(this.alg.isValid("()[]{}"));
        Assert.assertTrue(this.alg.isValid("{{}}"));
    }

    /**
     * Test that parentheses is invalid.
     */
    @Test
    public void testInvalid(){
        Assert.assertFalse(this.alg.isValid("{]"));
        Assert.assertFalse(this.alg.isValid("{}}"));
    }
}

