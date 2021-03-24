package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class GoodNodesTestCase {

    private GoodNodes alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new GoodNodes();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        tree.left.right = new PlainTree(2);
        Assert.assertEquals(
            3,
            this.alg.goodNodes(tree)
        );
    }

    @Test
    public void test2(){
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(1);
        tree.right = new PlainTree(4);
        tree.left.left = new PlainTree(3);
        tree.right.left = new PlainTree(1);
        tree.right.right = new PlainTree(5);
        Assert.assertEquals(
            4,
            this.alg.goodNodes(tree)
        );
    }
}
