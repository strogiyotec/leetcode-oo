package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SubtreeOfAnotherTreeTestCase {

    private SubtreeOfAnotherTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SubtreeOfAnotherTree();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(4);
        tree.right = new PlainTree(5);
        tree.left.left = new PlainTree(1);
        tree.left.right = new PlainTree(2);

        final PlainTree sub = new PlainTree(4);
        sub.left = new PlainTree(1);
        sub.right = new PlainTree(2);
        Assert.assertTrue(this.alg.isSubtree(tree,sub));
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(4);
        tree.right = new PlainTree(5);
        tree.left.left = new PlainTree(1);
        tree.left.right = new PlainTree(2);
        tree.left.right.left = new PlainTree(0);

        final PlainTree sub = new PlainTree(4);
        sub.left = new PlainTree(1);
        sub.right = new PlainTree(2);
        Assert.assertFalse(this.alg.isSubtree(tree,sub));
    }
}
