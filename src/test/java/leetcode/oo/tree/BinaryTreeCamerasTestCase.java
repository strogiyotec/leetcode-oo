package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BinaryTreeCamerasTestCase {

    private BinaryTreeCameras alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new BinaryTreeCameras();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.left.left = new PlainTree(3);
        tree.left.left.left = new PlainTree(4);
        tree.left.left.left.right = new PlainTree(5);
        Assert.assertEquals(
            2,
            this.alg.minCameraCover(tree)
        );
    }
}
