package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class AddRowTestCase {

    private AddRow alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new AddRow();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(4);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(6);
        tree.left.left = new PlainTree(3);
        tree.left.right = new PlainTree(1);
        tree.right.left = new PlainTree(5);
        this.alg.addOneRow(tree, 1, 2);
        Assert.assertEquals(1, tree.left.val);
        Assert.assertEquals(1, tree.right.val);
    }

    @Test
    public void test2() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        this.alg.addOneRow(tree, 5, 4);
        Assert.assertEquals(5, tree.left.left.left.val);
    }

    @Test
    public void test3() {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(4);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(2);
        this.alg.addOneRow(tree, 2, 3);
        Assert.assertEquals(2,tree.right.right.val);
    }
}
