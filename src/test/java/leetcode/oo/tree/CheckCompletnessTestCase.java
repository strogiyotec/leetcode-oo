package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CheckCompletnessTestCase {

    private CheckCompletnessOfTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CheckCompletnessOfTree();
    }


    @Test
    public void test3() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(5);
        Assert.assertTrue(this.alg.isCompleteTree(tree));
    }
    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        tree.left.right = new PlainTree(5);
        tree.right = new PlainTree(3);
        tree.right.left = new PlainTree(6);
        Assert.assertTrue(this.alg.isCompleteTree(tree));
    }
    @Test
    public void test() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        tree.left.right = new PlainTree(5);
        tree.right = new PlainTree(3);
        tree.right.right = new PlainTree(6);
        Assert.assertFalse(this.alg.isCompleteTree(tree));
    }
}
