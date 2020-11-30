package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class InvertTreeTestCase {

    private InvertTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new InvertTree();
    }

    @Test
    public void test() {
        final PlainTree root = new PlainTree(4);
        root.left = new PlainTree(2);
        root.left.left = new PlainTree(1);
        root.left.right = new PlainTree(3);
        root.right = new PlainTree(7);
        root.right.right = new PlainTree(9);
        root.right.left = new PlainTree(6);
        final PlainTree tree = this.alg.invertTree(
            root
        );
        Assert.assertEquals(7L, (long) tree.left.val);
        Assert.assertEquals(2L, (long) tree.right.val);
    }
}
