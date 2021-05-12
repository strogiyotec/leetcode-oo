package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BinaryTreeColoringTestCase {

    private BinaryTreeColoring alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new BinaryTreeColoring();
    }

    @Test
    public void test1() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.left.right = new PlainTree(5);
        tree.left.left = new PlainTree(4);
        tree.left.left.left = new PlainTree(8);
        tree.left.left.right = new PlainTree(9);
        tree.left.right.left = new PlainTree(10);
        tree.left.right.right = new PlainTree(11);

        tree.right = new PlainTree(3);
        tree.right.left = new PlainTree(6);
        tree.right.right = new PlainTree(7);
        Assert.assertTrue(this.alg.btreeGameWinningMove(tree, 11, 3));
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        Assert.assertTrue(this.alg.btreeGameWinningMove(tree,3,2));

    }
}
