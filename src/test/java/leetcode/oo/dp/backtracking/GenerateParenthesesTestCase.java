package leetcode.oo.dp.backtracking;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Almas Abdrazak (almas337519@gmail.com)
 */
public final class GenerateParenthesesTestCase {

    private GenerateParentheses alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new GenerateParentheses();
    }

    @Test
    public void test() {
        final List<String> parenthesis = this.alg.generateParenthesis(3);
        Assert.assertEquals(
            Arrays.asList(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
            ),
            parenthesis
        );
    }
}
