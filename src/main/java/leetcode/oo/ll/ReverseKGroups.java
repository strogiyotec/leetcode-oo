package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/reverse-nodes-in-k-group/
final class ReverseKGroups {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) {
            return head;
        }
        final ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode tail = dummy;
        while (true) {
            int cnt = k;
            while (cnt > 0 && tail != null) {
                cnt--;
                tail = tail.next;
            }
            if (tail == null) {
                break;
            }
            ListNode listNode = prev.next;
            while (prev.next != tail) {
                final ListNode temp = prev.next;
                prev.next = temp.next;
                temp.next = tail.next;
                tail.next = temp;
            }
            prev = listNode;
            tail = listNode;
        }
        return dummy.next;
    }
}
