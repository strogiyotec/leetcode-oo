package leetcode.oo.reverse;

import leetcode.oo.ListNode;

/**
 * Reverse Linked List.
 * See {@link <a href ="https://leetcode.com/problems/reverse-linked-list/">https://leetcode.com/problems/reverse-linked-list/</a>}
 */
final class ReversedList {

    /**
     * Reverse given list.
     *
     * @param head Head of list
     * @return Reversed list
     */
    ListNode reverseList(final ListNode head) {
        if (head.next == null) {
            return head;
        }
        final ListNode reversed = this.reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}
