package leetcode.oo.tree;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LevelOrderTraversalTestCase {

    private LevelOrderTraversal alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LevelOrderTraversal();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(9);
        tree.right = new PlainTree(20);
        tree.right.left = new PlainTree(15);
        tree.right.right = new PlainTree(7);
        Assert.assertEquals(
            Arrays.asList(
                Collections.singletonList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
            ),
            this.alg.levelOrder(tree)
        );
    }
}
