package leetcode.oo.tree.path;

import leetcode.oo.tree.PlainTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public final class PathSum2TestCase {
    private PathSum2 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PathSum2();
    }

    @Test
    public void testNegative() {
        final PlainTree tree = new PlainTree(-2);
        tree.right = new PlainTree(-3);
        Assert.assertEquals(
                this.alg.pathSum(tree, -5),
                Collections.singletonList(
                        Arrays.asList(-2, -3)
                )
        );
    }

    @Test
    public void testPositive() {
        final PlainTree tree = new PlainTree(5);
        tree.left = new PlainTree(4);
        tree.left.left = new PlainTree(11);
        tree.left.left.left = new PlainTree(7);
        tree.left.left.right = new PlainTree(2);
        tree.right = new PlainTree(8);
        tree.right.left = new PlainTree(13);
        tree.right.right = new PlainTree(4);
        tree.right.right.left = new PlainTree(5);
        tree.right.right.right = new PlainTree(1);

        Assert.assertEquals(
                this.alg.pathSum(tree, 22),
                Arrays.asList(
                        Arrays.asList(5, 4, 11, 2),
                        Arrays.asList(5, 8, 4, 5)
                )
        );
    }
}
