package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ModeInBstTestCase {

    private ModeInBst alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ModeInBst();
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(1);
        tree.right = new PlainTree(2);
        tree.left = new PlainTree(1);
        Assert.assertArrayEquals(
            new int[]{1},
            this.alg.findMode(tree)
        );
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(1);
        tree.right = new PlainTree(2);
        tree.right.left = new PlainTree(2);
        Assert.assertArrayEquals(
            new int[]{2},
            this.alg.findMode(tree)
        );
    }
}
