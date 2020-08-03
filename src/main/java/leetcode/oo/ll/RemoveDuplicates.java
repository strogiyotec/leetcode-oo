package leetcode.oo.ll;

import leetcode.oo.ListNode;

/**
 * Remove Duplicates from Sorted List.
 * See {@link <a href ="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">https://leetcode.com/problems/remove-duplicates-from-sorted-list/</a>}
 */
final class RemoveDuplicates {

    ListNode deleteDuplicates(final ListNode head) {
        ListNode answer = head;
        while (answer != null) {
            if (answer.next != null) {
                final int headV = answer.val;
                final int nextV = answer.next.val;
                if (headV == nextV) {
                    answer.next = answer.next.next;
                } else {
                    answer = answer.next;
                }
            } else {
                break;
            }
        }
        return head;
    }
}
