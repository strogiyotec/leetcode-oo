package leetcode.oo.dp;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RemoveInvalidParenthesesTestCase {

    private RemoveInvalidParentheses alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new RemoveInvalidParentheses();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            Arrays.asList("(())()", "()()()"),
            this.alg.removeInvalidParentheses("()())()")
        );
    }
}
