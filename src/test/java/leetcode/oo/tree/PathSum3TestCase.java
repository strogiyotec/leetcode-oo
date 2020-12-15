package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PathSum3TestCase {

    private PathSum3 alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new PathSum3();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(10);
        tree.left = new PlainTree(5);
        tree.left.left = new PlainTree(3);
        tree.left.left.left = new PlainTree(3);
        tree.left.left.right = new PlainTree(-2);
        tree.left.right = new PlainTree(2);
        tree.left.right.right = new PlainTree(1);
        tree.right = new PlainTree(-3);
        tree.right.right = new PlainTree(11);
        Assert.assertEquals(
            3L,
            (long) this.alg.pathSum(tree, 8)
        );
    }
}
