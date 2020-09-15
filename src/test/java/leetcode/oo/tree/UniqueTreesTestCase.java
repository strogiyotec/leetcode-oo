package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class UniqueTreesTestCase {
    private UniqueTrees alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new UniqueTrees();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.numTrees(3),
                5
        );
        Assert.assertEquals(
                this.alg.numTrees(4),
                14
        );
    }
}
