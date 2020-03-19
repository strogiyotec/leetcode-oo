package leetcode.oo.pointers;

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
    private RemovedList.ListNode head;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.list = new RemovedList();
        RemovedList.ListNode node = new RemovedList.ListNode(1);
        this.head = node;
        for (int i = 2; i <= 5; i++) {
            node.next = new RemovedList.ListNode(i);
            node = node.next;
        }
    }

    /**
     * Test that pre last node was removed.
     */
    @Test
    @SuppressWarnings("LineLength")
    public void testRemove() {
        final RemovedList.ListNode listNode = this.list.removeNthFromEnd(this.head, 2);
        Assert.assertThat(
                listNode.toString(),
                CoreMatchers.is("1_2_3_5")
        );
    }
}
