package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BalanceBinarySearchTreeTestCase {

    private BalanceBinarySearchTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new BalanceBinarySearchTree();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(1);
        tree.right = new PlainTree(2);
        tree.right.right = new PlainTree(3);
        tree.right.right.right = new PlainTree(4);
        final PlainTree balanced = this.alg.balanceBST(tree);
        Assert.assertEquals(
            2,
            balanced.val
        );
        Assert.assertEquals(
            1,
            balanced.left.val
        );
        Assert.assertEquals(
            3,
            balanced.right.val
        );
        Assert.assertEquals(
            4,
            balanced.right.right.val
        );
    }
}
