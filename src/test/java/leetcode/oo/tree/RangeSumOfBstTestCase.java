package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RangeSumOfBstTestCase {

    private RangeSumOfBst alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RangeSumOfBst();
    }


    @Test
    public void test() {
        final PlainTree tree = new PlainTree(10);
        tree.left = new PlainTree(5);
        tree.right = new PlainTree(15);
        tree.left.left = new PlainTree(3);
        tree.left.right = new PlainTree(7);
        tree.right.right = new PlainTree(18);
        Assert.assertEquals(
                this.alg.rangeSumBST(tree,7,15),
                32
        );
    }
}
