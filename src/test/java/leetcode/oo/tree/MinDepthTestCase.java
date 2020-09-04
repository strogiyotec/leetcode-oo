package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinDepthTestCase {
    private MinDepthOfTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinDepthOfTree();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(9);
        tree.right = new PlainTree(20);
        tree.right.left = new PlainTree(15);
        tree.right.right = new PlainTree(7);
        Assert.assertEquals(
                this.alg.minDepth(tree),
                2
        );
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.left.left = new PlainTree(3);
        tree.left.left.left = new PlainTree(4);
        tree.left.left.left.left = new PlainTree(5);
        Assert.assertEquals(
                this.alg.minDepth(tree),
                5
        );
    }
}
