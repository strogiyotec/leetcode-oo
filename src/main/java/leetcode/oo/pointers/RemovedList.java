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
        ListNode findLength = head;
        final ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        while (findLength != null) {
            length++;
            findLength = findLength.next;
        }
        int removePosition = length - position;
        findLength = dummy;
        while (removePosition > 0) {
            findLength = findLength.next;
            removePosition--;
        }
        findLength.next = findLength.next.next;
        return dummy.next;
    }
}
