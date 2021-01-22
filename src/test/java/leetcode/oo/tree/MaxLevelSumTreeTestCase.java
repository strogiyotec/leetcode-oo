package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxLevelSumTreeTestCase {

    private MaxLevelSumOfBinaryTree alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new MaxLevelSumOfBinaryTree();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(7);
        tree.left.left = new PlainTree(7);
        tree.left.right = new PlainTree(-8);
        tree.right = new PlainTree(0);
        Assert.assertEquals(
            2L,
            (long) this.alg.maxLevelSum(tree)
        );
    }
}
