package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case for {@link NodeDepth}.
 */
public final class NodeDepthTestCase {

    private NodeDepth alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NodeDepth();
    }

    /**
     * Depth of 6 is 3.
     */
    @Test
    public void testDepth() {
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(9);
        tree.right = new PlainTree(20);
        tree.right.left = new PlainTree(15);
        tree.right.right = new PlainTree(7);
        Assert.assertEquals(
                this.alg.maxDepth(tree),
                3
        );
    }
}
