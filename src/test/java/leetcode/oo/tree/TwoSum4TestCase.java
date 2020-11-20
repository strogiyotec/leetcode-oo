package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TwoSum4TestCase {

    private TwoSum4 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new TwoSum4();
    }

    @Test
    public void testNegative() {
        final PlainTree tree = new PlainTree(1);
        Assert.assertFalse(this.alg.findTarget(tree, 2));
    }

    @Test
    public void testPositive() {
        final PlainTree tree = new PlainTree(5);
        tree.left = new PlainTree(3);
        tree.right = new PlainTree(6);
        tree.left.left = new PlainTree(2);
        tree.left.right = new PlainTree(4);
        tree.right.right = new PlainTree(7);
        Assert.assertTrue(this.alg.findTarget(tree, 9));
    }
}
