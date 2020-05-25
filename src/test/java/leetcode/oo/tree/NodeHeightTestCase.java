package leetcode.oo.tree;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for {@link NodeHeight}.
 */
public final class NodeHeightTestCase {

    /**
     * Test  depth of the root.
     */
    @Test
    public void testDepth() {
        final TreeNode treeNode = new BstFromArray().create(
                new int[]{
                        5, 2, 13, 0, 8, 6,
                }
        );
        final int depth = new NodeHeight().height(treeNode);
        Assert.assertThat(depth, CoreMatchers.is(3));
    }

}
