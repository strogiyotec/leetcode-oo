package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PopulateNextRightTestCase {

    private PopulateNextRight alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PopulateNextRight();
    }

    @Test
    public void test() {
        final PopulateNextRight.Node node = new PopulateNextRight.Node(1);
        node.left = new PopulateNextRight.Node(2);
        node.right = new PopulateNextRight.Node(3);
        node.left.left = new PopulateNextRight.Node(4);
        node.left.right = new PopulateNextRight.Node(5);
        node.right.left = new PopulateNextRight.Node(6);
        node.right.right = new PopulateNextRight.Node(7);
        final PopulateNextRight.Node root = new PopulateNextRight().connect(node);
        Assert.assertEquals(root.right.left.next.val, 7);
        Assert.assertEquals(root.left.next.val, 3);
    }
}
