package leetcode.oo.ll;

import leetcode.oo.ListNode;

/**
 * Middle of the Linked List.
 * See {@link <a href ="https://leetcode.com/problems/middle-of-the-linked-list/">https://leetcode.com/problems/middle-of-the-linked-list/</a>}
 */
final class MiddleOfLinked {
    ListNode middleNode(final ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
