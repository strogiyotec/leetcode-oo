package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TrimBinaryTreeTestCase {

    private TrimBinaryTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new TrimBinaryTree();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(0);
        tree.right = new PlainTree(4);
        tree.left.right = new PlainTree(2);
        tree.left.right.left = new PlainTree(1);
        final PlainTree solution = this.alg.trimBST(
            tree, 1, 3
        );
        Assert.assertEquals(
            3,
            solution.val
        );
        Assert.assertNull(solution.right);
        Assert.assertEquals(2, solution.left.val);
        Assert.assertEquals(1, solution.left.left.val);
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(1);
        tree.right = new PlainTree(4);
        tree.left.right = new PlainTree(2);
        final PlainTree solution = this.alg.trimBST(
            tree, 3, 4
        );
        Assert.assertEquals(
            3,
            solution.val
        );
        Assert.assertNull(solution.left);
        Assert.assertEquals(4, solution.right.val);
    }

}
