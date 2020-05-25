package leetcode.oo.tree.traversal;

import leetcode.oo.tree.BstFromArray;
import leetcode.oo.tree.TreeNode;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Test case for {@link InOrderTraversal}.
 */
public final class InOrderTraversalTestCase {

    /**
     * Test traversal.
     */
    @Test
    public void testTraversal() {
        final TreeNode treeNode = new BstFromArray()
                .create(
                        new int[]{
                                1, 2, 3,
                        }
                );
        Assert.assertThat(
                new InOrderTraversal().travers(treeNode),
                CoreMatchers.equalTo(Arrays.asList(1, 2, 3))
        );
    }
}
