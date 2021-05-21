package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DisjointForestTestCase {

    private DisjointForest alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DisjointForest();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.right.right = new PlainTree(4);
        Assert.assertEquals(
            1,
            this.alg.delNodes(
                tree, new int[]{2, 1}
            ).size()
        );
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        tree.left.right = new PlainTree(5);
        tree.right.left = new PlainTree(6);
        tree.right.right = new PlainTree(7);
        Assert.assertEquals(
            3,
            this.alg.delNodes(
                tree, new int[]{3, 5}
            ).size()
        );
    }
}
