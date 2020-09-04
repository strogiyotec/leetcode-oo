package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public final class CombinationsTestCase {

    private Combinations alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new Combinations();
    }

    @Test
    public void test(){
        final List<List<Integer>> combinations = this.alg.combine(4, 2);
        Assert.assertEquals(combinations.size(),6);
    }
}
