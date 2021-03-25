package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DuplicateSubTreeTestCase {

    private DuplicateSubTrees alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DuplicateSubTrees();
    }

    @Test
    public void testEmpty() {
        final PlainTree tree = new PlainTree(2);
        tree.left = new PlainTree(1);
        tree.right = new PlainTree(11);
        tree.left.left = new PlainTree(11);
        tree.right.left = new PlainTree(1);
        Assert.assertTrue(this.alg.findDuplicateSubtrees(tree).isEmpty());
    }
}
