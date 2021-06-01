package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PruneTreeTestCase {

    private PruneTree alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new PruneTree();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(0);
        tree.right = new PlainTree(0);
        tree.right.left = new PlainTree(0);
        tree.right.right = new PlainTree(0);
        Assert.assertNull(this.alg.pruneTree(tree));
    }
}
