package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class StepByStepDirectionsTestCase {

    private StepByStepDirections alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new StepByStepDirections();
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(5);
        tree.left = new PlainTree(2);
        tree.left.right = new PlainTree(8);
        tree.right = new PlainTree(4);
        tree.left.left = new PlainTree(3);
        tree.left.left.left = new PlainTree(1);
        Assert.assertEquals(
            "UUR",
            this.alg.getDirections(
                tree,
                1,8
            )
        );
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(5);
        tree.left = new PlainTree(1);
        tree.right = new PlainTree(2);
        tree.left.left = new PlainTree(3);
        tree.right.left = new PlainTree(6);
        tree.right.right = new PlainTree(4);
        Assert.assertEquals(
            "UURL",
            this.alg.getDirections(
                tree,
                3, 6
            )
        );
    }
}
