package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DeepestNodeTreeTestCase {

    private DeepestNodesTree alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new DeepestNodesTree();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(5);
        tree.right = new PlainTree(1);
        tree.left.left = new PlainTree(6);
        tree.left.right = new PlainTree(2);
        tree.right.left = new PlainTree(0);
        tree.right.right = new PlainTree(8);
        tree.left.right.left = new PlainTree(7);
        tree.left.right.right = new PlainTree(4);
        Assert.assertEquals(
            2,
            this.alg.subtreeWithAllDeepest(tree).val
        );
    }

    @Test
    public void testSingleChild(){
        final PlainTree tree = new PlainTree(0);
        tree.left = new PlainTree(1);
        tree.right = new PlainTree(3);
        tree.left.right = new PlainTree(2);
        Assert.assertEquals(
            2,
            this.alg.subtreeWithAllDeepest(tree).val
        );
    }
}
