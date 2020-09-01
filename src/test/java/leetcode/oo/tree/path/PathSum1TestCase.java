package leetcode.oo.tree.path;

import leetcode.oo.tree.PlainTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PathSum1TestCase {

    private PathSum1 alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new PathSum1();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(5);
        tree.left = new PlainTree(4);
        tree.left.left = new PlainTree(11);
        tree.left.left.right = new PlainTree(2);
        tree.left.left.left = new PlainTree(7);
        Assert.assertTrue(
                this.alg.hasPathSum(tree,22)
        );
    }
}
