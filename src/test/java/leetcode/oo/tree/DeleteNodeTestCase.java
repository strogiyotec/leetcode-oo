package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DeleteNodeTestCase {
    private DeleteNodeInTree alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new DeleteNodeInTree();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(6);
        tree.left = new PlainTree(3);
        tree.left.left = new PlainTree(2);
        tree.left.right = new PlainTree(4);
        tree.right = new PlainTree(8);
        tree.right.right = new PlainTree(9);
        tree.right.left = new PlainTree(7);
        Assert.assertEquals(
            7,
            this.alg.deleteNode(tree,6).val
        );
    }
}
