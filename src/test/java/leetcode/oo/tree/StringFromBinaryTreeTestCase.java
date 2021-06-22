package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class StringFromBinaryTreeTestCase {

    private StringFromBinaryTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new StringFromBinaryTree();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        Assert.assertEquals(
            "1(2(4))(3)",
            this.alg.tree2str(tree)
        );
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.right = new PlainTree(4);
        Assert.assertEquals(
            "1(2()(4))(3)",
            this.alg.tree2str(tree)
        );
    }
}
