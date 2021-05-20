package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/rotate-list/
final class RotateList {

    ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int size = 1;
        ListNode dummy = head;
        while (dummy.next != null) {
            dummy = dummy.next;
            size++;
        }
        k %= size;
        if (k == 0) {
            return head;
        }
        ListNode current = head;
        for (int i = 0; i < size - k - 1; i++) {
            current = current.next;
        }
        final ListNode solution = current.next;
        current.next = null;
        dummy.next = head;
        return solution;

    }
}
