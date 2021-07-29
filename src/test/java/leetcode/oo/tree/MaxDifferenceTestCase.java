package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxDifferenceTestCase {

    private MaxDifference alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxDifference();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(1);
        tree.right = new PlainTree(2);
        tree.right.right = new PlainTree(0);
        tree.right.right.left = new PlainTree(3);
        Assert.assertEquals(
            3,
            this.alg.maxAncestorDiff(tree)
        );
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(8);
        tree.left = new PlainTree(3);
        tree.right = new PlainTree(10);
        tree.left.left = new PlainTree(1);
        tree.left.right = new PlainTree(6);
        tree.left.right.left = new PlainTree(4);
        tree.left.right.right = new PlainTree(7);
        tree.right.right = new PlainTree(14);
        tree.right.right.left = new PlainTree(13);
        Assert.assertEquals(
            7,
            this.alg.maxAncestorDiff(tree)
        );
    }
}
