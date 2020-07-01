package leetcode.oo.reverse;

import leetcode.oo.ListNode;

/**
 * Reverse Linked List.
 * See {@link <a href ="https://leetcode.com/problems/reverse-linked-list/">https://leetcode.com/problems/reverse-linked-list/</a>}
 */
public final class ReversedList {

    /**
     * Reverse given list.
     *
     * @param head Head of list
     * @return Reversed list
     */
    public ListNode reverseList(final ListNode head) {
        if (head.next == null) {
            return head;
        }
        final ListNode reversed = this.reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;

    }

    /**
     * Check if node is the tail.
     *
     * @param node List node
     * @return True if given node is null
     * or it doesn't have next element
     */
    private boolean isLast(final ListNode node) {
        return node == null || node.next == null;
    }
}
