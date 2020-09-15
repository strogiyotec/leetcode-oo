package leetcode.oo.ll;

import leetcode.oo.ListNode;

/**
 * Linked list intersections.
 * See {@link <a href ="https://leetcode.com/problems/intersection-of-two-linked-lists/">https://leetcode.com/problems/intersection-of-two-linked-lists/</a>}
 */
final class Intersection {

    ListNode getIntersectionNode(final ListNode first, final ListNode second) {
        ListNode fast = first;
        ListNode slow = second;
        while (fast != slow) {
            if (fast == null) {
                fast = second;
            } else {
                fast = fast.next;
            }
            if (slow == null) {
                slow = first;
            } else {
                slow = slow.next;
            }
        }
        return fast;
    }
}
