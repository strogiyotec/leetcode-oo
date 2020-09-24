package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxPathSumTestCase {

    private MaxPathSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxPathSum();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(5);
        tree.left = new PlainTree(4);
        tree.left.left = new PlainTree(11);
        tree.left.left.left = new PlainTree(7);
        tree.left.left.right = new PlainTree(2);
        tree.right = new PlainTree(8);
        tree.right.right = new PlainTree(4);
        tree.right.left = new PlainTree(13);
        tree.right.right.left = new PlainTree(1);
        Assert.assertEquals(
            48L,
            (long) this.alg.maxPathSum(tree)
        );
    }
}
