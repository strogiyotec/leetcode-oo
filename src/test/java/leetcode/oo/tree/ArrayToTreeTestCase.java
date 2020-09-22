package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ArrayToTreeTestCase {

    private ArrayToTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ArrayToTree();
    }

    @Test
    public void test() {
        final PlainTree tree = this.alg.sortedArrayToBST(new int[]{0, 1, 2, 3, 4, 5});
        Assert.assertEquals(
            2,
            tree.val
        );
        Assert.assertEquals(
            0,
            tree.left.val
        );
        Assert.assertEquals(
            1,
            tree.left.right.val
        );
        Assert.assertEquals(
            4,
            tree.right.val
        );
        Assert.assertEquals(
            5,
            tree.right.right.val
        );
        Assert.assertEquals(
            3,
            tree.right.left.val
        );
    }
}
