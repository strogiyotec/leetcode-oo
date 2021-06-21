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
}
