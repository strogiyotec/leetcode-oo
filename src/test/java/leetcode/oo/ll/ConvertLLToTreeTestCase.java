package leetcode.oo.ll;

import leetcode.oo.ListNode;
import leetcode.oo.tree.PlainTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ConvertLLToTreeTestCase {

    private ConvertLLToTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ConvertLLToTree();
    }

    @Test
    public void test() {
        final PlainTree tree = this.alg.sortedListToBST(
            new ListNode(-10).withNext(-3).withNext(0).withNext(5).withNext(9)
        );
        Assert.assertEquals(tree.val,0);
        Assert.assertEquals(tree.left.val,-3);
        Assert.assertEquals(tree.left.left.val,-10);
        Assert.assertEquals(tree.right.val,9);
        Assert.assertEquals(tree.right.left.val,5);
    }
}
