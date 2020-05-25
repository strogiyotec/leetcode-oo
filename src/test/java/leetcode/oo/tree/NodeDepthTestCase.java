package leetcode.oo.tree;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for {@link NodeDepth}.
 */
public final class NodeDepthTestCase {

    /**
     * Depth of 6 is 3.
     */
    @Test
    public void testDepth() {
        final TreeNode treeNode = new BstFromArray().create(
                new int[]{
                        5, 2, 13, 0, 8, 6,
                }
        );
        final int depth = new NodeDepth().depth(treeNode, 6);
        Assert.assertThat(depth, CoreMatchers.is(3));
    }
}
