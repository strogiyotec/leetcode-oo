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

    @Test
    public void test2(){
        Assert.assertTrue(
            this.alg.checkValidString("(*)")
        );
    }

    @Test
    public void test3(){
        Assert.assertFalse(
            this.alg.checkValidString("*(")
        );
    }
}
