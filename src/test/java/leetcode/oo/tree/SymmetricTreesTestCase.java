package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SymmetricTreesTestCase {

    private SymmetricTrees alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SymmetricTrees();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(2);
        tree.right.right = new PlainTree(3);
        tree.right.left = new PlainTree(4);
        tree.left.left = new PlainTree(3);
        tree.left.right = new PlainTree(4);
        Assert.assertTrue(
                this.alg.isSymmetric(tree)
        );
    }
}
