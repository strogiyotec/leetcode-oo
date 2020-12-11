package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestUnivaluePathTestCase {

    private LongestUnivaluePath alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new LongestUnivaluePath();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(4);
        tree.right = new PlainTree(5);
        tree.left.left = new PlainTree(4);
        tree.left.right = new PlainTree(4);
        tree.right.left = new PlainTree(5);
        Assert.assertEquals(
            2L,
            (long) this.alg.longestUnivaluePath(tree)
        );
    }
}
