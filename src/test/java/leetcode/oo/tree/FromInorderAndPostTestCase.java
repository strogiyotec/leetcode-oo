package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FromInorderAndPostTestCase {

    private FromInorderPostOrder alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new FromInorderPostOrder();
    }

    @Test
    public void test(){
        final PlainTree tree = this.alg.buildTree(
            new int[]{2, 1, 4, 3, 5},
            new int[]{2, 4, 5, 3, 1}
        );
        Assert.assertEquals(1,tree.val);
        Assert.assertEquals(2,tree.left.val);
        Assert.assertEquals(3,tree.right.val);
        Assert.assertEquals(4,tree.right.left.val);
        Assert.assertEquals(5,tree.right.right.val);
    }
}
