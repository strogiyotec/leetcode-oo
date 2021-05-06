package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ListHasCycleTestCase {

    private ListHasCycle alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ListHasCycle();
    }

    @Test
    public void test(){
        final ListNode node = new ListNode(3);
        node.next = new ListNode(2);
        node.next.next = new ListNode(0);
        node.next.next.next = new ListNode(-4);
        node.next.next.next.next = node.next;
        Assert.assertTrue(
            this.alg.hasCycle(node)
        );
    }
}
