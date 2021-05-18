package leetcode.oo.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinRemoveValidParenthesisTestCase {

    private MinRemoveValidParenthesis alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinRemoveValidParenthesis();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "lee(t(c)o)de",
            this.alg.minRemoveToMakeValid("lee(t(c)o)de)")
        );
        Assert.assertEquals(
            "",
            this.alg.minRemoveToMakeValid("))((")
        );
        Assert.assertEquals(
            "ab(c)d",
            this.alg.minRemoveToMakeValid("a)b(c)d")
        );
    }
}
