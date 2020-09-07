package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RootToLeafSumTestCase {

    private RootToLeafSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RootToLeafSum();
    }

    @Test
    public void test1() {
        final PlainTree tree = new PlainTree(4);
        tree.left = new PlainTree(9);
        tree.right = new PlainTree(0);
        tree.left.left = new PlainTree(5);
        tree.left.right = new PlainTree(1);
        Assert.assertEquals(
                this.alg.sumNumbers(tree),
                1026
        );
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        Assert.assertEquals(
                this.alg.sumNumbers(tree),
                25
        );
    }
}
