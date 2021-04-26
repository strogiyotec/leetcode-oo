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

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(1);
        tree.right = new PlainTree(2);
        tree.right.left = new PlainTree(3);
        tree.right.right = new PlainTree(4);
        tree.right.right.right = new PlainTree(5);
        Assert.assertEquals(
            2,
            this.alg.minCameraCover(tree)
        );
    }
}
