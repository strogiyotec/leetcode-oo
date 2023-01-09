package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/rotate-list/
final class RotateList {

    ListNode rotateRight(ListNode head, int k) {
        if (k == 0) {
            return head;
        }
        int size = 0;
        ListNode dummy = head;
        while (dummy != null) {
            dummy = dummy.next;
            size++;
        }
        int mod = k % size;
        if (mod == 0) {
            return head;
        }
        ListNode temp = head;
        for (int i = 1; i < size - mod; i++) {
            temp = temp.next;
        }
        ListNode rotatedHead = temp.next;
        temp.next = null;
        ListNode last = rotatedHead;
        while (last.next != null) {
            last = last.next;
        }
        last.next = head;
        return rotatedHead;
    }
}
