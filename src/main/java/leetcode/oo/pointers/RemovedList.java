package leetcode.oo.pointers;

import leetcode.oo.ListNode;

/**
 * List with removed element from tail.
 * See {@link <a href ="https://leetcode.com/problems/remove-nth-node-from-end-of-list/solution/">https://leetcode.com/problems/remove-nth-node-from-end-of-list/solution/</a>}
 */
public final class RemovedList {

    /**
     * Remove Nth element from end.
     *
     * @param head     Head
     * @param position Position
     * @return Node with removed element
     */
    public ListNode removeNthFromEnd(final ListNode head, final int position) {
        final ListNode freshHead = new ListNode(0);
        ListNode start = freshHead;
        ListNode end = freshHead;
        freshHead.next = head;
        for (int i = 0; i <= position; i++) {
            end = end.next;
        }
        while (end != null) {
            end = end.next;
            start = start.next;
        }
        start.next = start.next.next;
        return freshHead.next;

    }
}
