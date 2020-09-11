package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BalancedTreeTestCase {

    private BalancedBinaryTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new BalancedBinaryTree();
    }

    @Test
    public void test1(){
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(9);
        tree.right = new PlainTree(20);
        tree.right.left = new PlainTree(15);
        tree.right.right = new PlainTree(7);
        Assert.assertTrue(this.alg.isBalanced(tree));
    }

    @Test
    public void test2(){
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(2);
        tree.left.left = new PlainTree(3);
        tree.left.right = new PlainTree(3);
        tree.left.left.left= new PlainTree(4);
        tree.left.left.right= new PlainTree(4);
        Assert.assertFalse(this.alg.isBalanced(tree));
    }

    @Test
    public void test3(){
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.left.left = new PlainTree(3);
        tree.left.left.left= new PlainTree(4);

        tree.right = new PlainTree(2);
        tree.right.right = new PlainTree(3);
        tree.right.right.right= new PlainTree(4);

        Assert.assertFalse(this.alg.isBalanced(tree));
    }
}
