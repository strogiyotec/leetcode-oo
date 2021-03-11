package leetcode.oo.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ValidParenthesisStringTestCase {

    private ValidParenthesisString alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ValidParenthesisString();
    }

    @Test
    public void test(){
        Assert.assertTrue(
            this.alg.checkValidString("(*))")
        );
    }
}
