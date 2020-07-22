package leetcode.oo.pointers;

import leetcode.oo.ListNode;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test {@link leetcode.oo.pointers.RemovedList}.
 */
public final class RemovedListTest {

    /**
     * List.
     */
    private RemovedList list;

    /**
     * Node.
     */
    private ListNode head;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.list = new RemovedList();
        ListNode node = new ListNode(1);
        this.head = node;
        for (int i = 2; i <= 5; i++) {
            node.next = new ListNode(i);
            node = node.next;
        }
    }

    /**
     * Test that pre last node was removed.
     */
    @Test
    @SuppressWarnings("LineLength")
    public void testRemove() {
        final ListNode listNode = this.list.removeNthFromEnd(this.head, 2);
        Assert.assertThat(
                listNode.toString(),
                CoreMatchers.is("1_2_3_5")
        );
    }

    @Test
    public void testTwoElements() {
        final ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        Assert.assertEquals(this.list.removeNthFromEnd(listNode, 2).toString(),"2");
    }

    @Test
    public void testOneElem() {
        Assert.assertNull(this.list.removeNthFromEnd(new ListNode(1), 1));
    }
}
