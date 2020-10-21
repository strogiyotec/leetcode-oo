package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CousinsTestCase {

    private Cousins alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Cousins();
    }

    @Test
    public void testSameParent() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        Assert.assertFalse(this.alg.isCousins(tree, 3, 4));
    }

    @Test
    public void testTrue() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.right = new PlainTree(4);
        tree.right.right = new PlainTree(5);
        Assert.assertTrue(this.alg.isCousins(tree, 4, 5));
    }
}
