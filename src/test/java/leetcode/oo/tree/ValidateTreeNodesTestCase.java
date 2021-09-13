package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ValidateTreeNodesTestCase {

    private ValidateTreeNodes alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ValidateTreeNodes();
    }

    @Test
    public void test() {
        Assert.assertTrue(
            this.alg.validateBinaryTreeNodes(
                4,
                new int[]{1,-1,3,-1},
                new int[]{2,-1,-1,-1}
            )
        );
        Assert.assertFalse(
            this.alg.validateBinaryTreeNodes(
                2,
                new int[]{1, 0},
                new int[]{-1, -1}
            )
        );
    }
}
