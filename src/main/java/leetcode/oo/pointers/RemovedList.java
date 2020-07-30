package leetcode.oo.pointers;

import leetcode.oo.ListNode;

/**
 * List with removed element from tail.
 * See {@link <a href ="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">https://leetcode.com/problems/remove-nth-node-from-end-of-list/</a>}
 */
final class RemovedList {

    /**
     * Remove Nth element from end.
     *
     * @param head     Head
     * @param position Position
     * @return Node with removed element
     */
    ListNode removeNthFromEnd(ListNode head, final int position) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (size == 1) {
            return null;
        }
        if (size == position) {
            return head.next;
        }
        temp = head;
        for (int i = 0; i < (size - position) - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
