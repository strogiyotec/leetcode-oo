package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestConsSeqTreeTestCase {

    private LongestConsSeqTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestConsSeqTree();
    }

    @Test
    public void test1() {
        final BstNode bstNode = new BstNode(2);
        bstNode.updateRight(new BstNode(3));
        bstNode.right().updateLeft(new BstNode(2));
        bstNode.right().left().updateLeft(new BstNode(1));
        Assert.assertEquals(
                this.alg.longestConsecutive(bstNode),
                2
        );
    }

    @Test
    public void test2() {
        final BstNode bstNode = new BstNode(1);
        bstNode.updateRight(new BstNode(3));
        bstNode.right().updateLeft(new BstNode(2));
        bstNode.right().updateRight(new BstNode(4));
        bstNode.right().right().updateRight(new BstNode(5));
        Assert.assertEquals(
                this.alg.longestConsecutive(bstNode),
                3
        );
    }
}
