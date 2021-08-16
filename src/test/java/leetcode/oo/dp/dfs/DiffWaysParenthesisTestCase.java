package leetcode.oo.dp.dfs;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DiffWaysParenthesisTestCase {

    private DiffWaysToAddParenthesis alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new DiffWaysToAddParenthesis();
    }

    @Test
    public void test(){
        final List<Integer> list = this.alg.diffWaysToCompute("2*3-4*5");
        list.sort(null);
        Assert.assertEquals(
            List.of(-34,-14,-10,-10,10),
            list
        );
    }
}
