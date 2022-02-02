package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/reverse-linked-list-ii/
final class ReverseList2 {

    public ListNode reverseBetween(final ListNode head, final int m, final int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode before = dummy;
        ListNode after = head;
        for (int i = 1; i < m; i++) {
            before = before.next;
            after = after.next;
        }
        //1-2-3-4-5
        //b-a-n-4-5
        for (int i = 0; i < n - m; i++) {
            final ListNode next = after.next;
            after.next = next.next;
            next.next = before.next;
            before.next = next;
        }
        return dummy.next;
    }
}
