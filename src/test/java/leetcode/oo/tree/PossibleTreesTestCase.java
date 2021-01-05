package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PossibleTreesTestCase {

    private PossibleTrees alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg= new PossibleTrees();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            5L,
            (long) this.alg.allPossibleFBT(7).size()
        );
    }
}
