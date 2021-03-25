package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LowestCommonAncestorBinaryTreeTestCase {

    private LowestCommonAncestorBinaryTree alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new LowestCommonAncestorBinaryTree();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(5);
        tree.right = new PlainTree(1);
        tree.left.left = new PlainTree(6);
        tree.left.right = new PlainTree(2);
        tree.left.right.left = new PlainTree(7);
        tree.left.right.right = new PlainTree(4);
        final PlainTree anc = this.alg.lowestCommonAncestor(
            tree, tree.left, tree.left.right.right
        );
        Assert.assertEquals(
            5,
            anc.val
        );
    }


}
