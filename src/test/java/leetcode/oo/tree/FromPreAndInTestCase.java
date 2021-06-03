package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FromPreAndInTestCase {

    private FromPreAndIn alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new FromPreAndIn();
    }

    @Test
    public void test(){
        final FromPreAndIn.TreeNode treeNode = this.alg.buildTree(
            new int[]{3, 9, 20, 15, 7},
            new int[]{9, 3, 15, 20, 7}
        );
        Assert.assertEquals(treeNode.val,3);
        Assert.assertEquals(treeNode.left.val,9);
        Assert.assertEquals(treeNode.right.val,20);
        Assert.assertEquals(treeNode.right.left.val,15);
        Assert.assertEquals(treeNode.right.right.val,7);
    }
}
