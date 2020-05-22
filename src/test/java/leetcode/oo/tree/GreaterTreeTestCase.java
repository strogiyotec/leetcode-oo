package leetcode.oo.tree;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test {@link GreaterTree}.
 */
public final class GreaterTreeTestCase {

    /**
     * Greater tree test case.
     */
    @Test
    public void testGreaterTree() {
        final TreeNode greaterTree = new GreaterTree()
                .convertBst(
                        new BstFromArray().create(
                                new int[]{5, 2, 13}
                        )
                );
        Assert.assertThat(greaterTree.value(), CoreMatchers.is(18));
        Assert.assertThat(greaterTree.left().value(), CoreMatchers.is(20));
        Assert.assertThat(greaterTree.right().value(), CoreMatchers.is(13));
    }
}
