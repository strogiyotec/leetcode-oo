package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ValidateBSTTestCase {
    private ValidBst alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ValidBst();
    }

    @Test
    public void test() {
        final TreeNode node = new BstFromArray().create(new int[]{2, 1, 3});
        Assert.assertTrue(this.alg.isValidBST(node));
    }

    @Test
    public void testDeep() {
        final BstNode node = new BstNode(10);
        node.updateLeft(new BstNode(5));
        node.updateRight(new BstNode(15));
        node.right().updateRight(new BstNode(20));
        node.right().updateLeft(new BstNode(6));
        Assert.assertFalse(this.alg.isValidBST(node));
    }

    @Test
    public void testFalse() {
        final BstNode node = new BstNode(5);
        node.updateLeft(new BstNode(1));
        node.updateRight(new BstNode(4));
        node.right().updateRight(new BstNode(6));
        node.right().updateLeft(new BstNode(3));
        Assert.assertFalse(this.alg.isValidBST(node));
    }
}
