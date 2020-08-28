package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class KthSmallestTestCase {

    private KthSmallest alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new KthSmallest();
    }

    @Test
    public void test() {
        final TreeNode treeNode = new BstFromArray().create(new int[]{5, 3, 6, 2, 4, 1});
        Assert.assertEquals(
                this.alg.kthSmallest(treeNode, 3),
                3
        );
    }
}
