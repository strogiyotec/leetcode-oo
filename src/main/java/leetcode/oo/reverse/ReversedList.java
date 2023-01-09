package leetcode.oo.reverse;

import leetcode.oo.ListNode;

/**
 * Reverse Linked List.
 * See {@link <a href ="https://leetcode.com/problems/reverse-linked-list/">https://leetcode.com/problems/reverse-linked-list/</a>}
 */
final class ReversedList {

    private ListNode reversed;

    /**
     * Reverse given list.
     *
     * @param head Head of list
     * @return Reversed list
     */
    ListNode reverseList(final ListNode head) {
        this.doReverse(head);
        return this.reversed;
    }

    private ListNode doReverse(final ListNode head) {
        if (head.next == null) {
            if (this.reversed == null) {
                this.reversed = head;
            }
            return head;
        }
        final ListNode next = this.doReverse(head.next);
        head.next = null;
        next.next = head;
        return head;
    }

}
