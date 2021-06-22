package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxWidthTestCase {

    private MaxWidth alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxWidth();
    }

    @Test
    public void test() {
        final PlainTree node = new PlainTree(1);
        node.left = new PlainTree(3);
        node.left.left = new PlainTree(5);
        node.left.right = new PlainTree(3);
        Assert.assertEquals(
            2,
            this.alg.widthOfBinaryTree(node)
        );
    }

    @Test
    public void test2() {
        final PlainTree node = new PlainTree(1);
        node.left = new PlainTree(3);
        node.right = new PlainTree(2);
        node.left.left = new PlainTree(5);
        node.left.right = new PlainTree(3);
        node.right.right = new PlainTree(9);
        Assert.assertEquals(
            4,
            this.alg.widthOfBinaryTree(node)
        );
    }

}
