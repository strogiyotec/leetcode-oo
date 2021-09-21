package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DiameterTestCase {

    private Diameter alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new Diameter();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        tree.left.right = new PlainTree(5);
        Assert.assertEquals(
            3,
            this.alg.diameterOfBinaryTree(tree)
        );
    }
}
